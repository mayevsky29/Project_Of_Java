package program.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import program.dto.admin.authordto.AuthorAddDto;
import program.dto.admin.authordto.roledto.RoleAddDto;
import program.entities.Author;
import program.entities.Role;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-19T16:46:32+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ApplicationMapperImpl implements ApplicationMapper {

    @Override
    public Role RoleByAddRoleDto(RoleAddDto dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( dto.getName() );

        return role;
    }

    @Override
    public Author AuthorByAddAuthorDto(AuthorAddDto dto) {
        if ( dto == null ) {
            return null;
        }

        Author author = new Author();

        author.setFullName( dto.getFullName() );

        return author;
    }
}
