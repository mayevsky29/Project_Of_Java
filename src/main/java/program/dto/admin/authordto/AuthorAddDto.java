package program.dto.admin.authordto;

import lombok.Data;

// модалка для таблиця автора
@Data
public class AuthorAddDto {
    private String fullName;
    private String imageBase64;
}
