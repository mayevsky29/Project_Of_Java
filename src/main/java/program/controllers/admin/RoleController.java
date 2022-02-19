package program.controllers.admin;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import program.dto.admin.authordto.roledto.RoleAddDto;
import program.dto.admin.authordto.roledto.RoleDeleteDto;
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


    @GetMapping("")
    public List<Role> list() {
        return roleRepository.findAll();
    }

    @PostMapping("/create")
    public int create(RoleAddDto model) {
        Role role = mapper.RoleByAddRoleDto(model);
        roleRepository.save(role);
        return role.getId();
    }
    @DeleteMapping ("/delete")
        public void deleteRole(@RequestBody RoleDeleteDto id){
        roleRepository.deleteById(Integer.parseInt(id.getId()));
        }



}
