package program.mapper;

import org.mapstruct.Mapper;
import program.dto.admin.authordto.AuthorAddDto;
import program.dto.admin.authordto.BookAddDto;
import program.dto.admin.authordto.roledto.RoleAddDto;
import program.entities.Author;
import program.entities.Book;
import program.entities.Role;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
    Role RoleByAddRoleDto(RoleAddDto dto);
    Author AuthorByAddAuthorDto(AuthorAddDto dto);
    Book BookByAddAuthorDto(BookAddDto addDto);
}
