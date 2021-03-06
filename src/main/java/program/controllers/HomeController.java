package program.controllers;

import org.springframework.core.io.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import program.repositories.RoleRepository;
import program.storage.StorageService;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final RoleRepository roleRepository;
    private final StorageService storageService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        return "main/index";
    }
// Збереження файла
    @GetMapping("/files/{filename:.+}")
    @ResponseBody
            // надсилається запит на сервер за іменем файла
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) throws Exception {

        Resource file = storageService.loadAsResource(filename);
        String urlFileName =  URLEncoder.encode("сало.jpg", StandardCharsets.UTF_8.toString());
        return ResponseEntity.ok()
                //.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
                // вказуэться тип контенту ресурсу
                .contentType(MediaType.IMAGE_JPEG)
                // вказується назва тіла файла
                .header(HttpHeaders.CONTENT_DISPOSITION,"filename=\""+urlFileName+"\"")
                .body(file);
    }

}