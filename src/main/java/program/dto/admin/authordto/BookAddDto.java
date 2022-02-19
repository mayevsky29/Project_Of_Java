package program.dto.admin.authordto;

import lombok.Data;

@Data
public class BookAddDto {
    public String name;
    public String description;
    public String imageBase64;
    public int AuthorId;
}
