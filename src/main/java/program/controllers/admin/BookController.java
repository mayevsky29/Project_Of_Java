package program.controllers.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import program.dto.admin.authordto.BookAddDto;
import program.entities.Book;
import program.mapper.ApplicationMapper;
import program.repositories.BookRepository;
import program.storage.StorageService;


import java.util.List;

@RestController
@RequestMapping("admin/books")
@RequiredArgsConstructor
public class BookController{
    private final StorageService storageService;
    private final BookRepository bookRepository;
    private final ApplicationMapper mapper;



    // додавання фото
    @PostMapping("/create")
    public String create(BookAddDto model) {
        Book book = mapper.BookByAddAuthorDto(model);
        String fileName=storageService.store(model.getImageBase64());
        book.setImage(fileName);
        bookRepository.save(book);
        return fileName;
    }
    @GetMapping("/get")
    public List<Book> list() {
        return bookRepository.findAll();
    }
}
