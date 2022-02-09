package program.dto.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import program.dto.admin.roledto.RoleAddDto;
import program.dto.admin.roledto.RoleDeleteDto;
import program.entities.Role;
import program.mapper.ApplicationMapper;
import program.repositories.RoleRepository;

import java.util.List;


@RestController
@RequestMapping("admin/roles")
@RequiredArgsConstructor
public class RoleController {
    private final RoleRepository roleRepository;
    private final ApplicationMapper mapper;

    @GetMapping("/get")
    public List<Role> list() {
        return roleRepository.findAll();
    }

    @PostMapping("/create")
    public int create(RoleAddDto model) {
        Role role = mapper.RoleByAddRoleDto(model);
        roleRepository.save(role);
        return role.getId();
    }
    @PostMapping("/delete")
    public void DeleteRole(RoleDeleteDto Idifiner){
        roleRepository.deleteById(Integer.parseInt(Idifiner.getId()));
    }
}
