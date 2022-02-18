package program.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import program.dto.admin.authordto.AuthorAddDto;
import program.dto.admin.roledto.RoleAddDto;
import program.entities.Role;
import program.repositories.RoleRepository;
import program.storage.StorageService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final RoleRepository roleRepository;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        return "main/index";
    }
}