package com.itheima.controller;

import com.itheima.domain.SysRole;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
@Secured("ROLE_ADMIN")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/findAllRoles")
    public String findAllRoles(Model model) {
        List<SysRole> roles = roleService.findAllRoles();
        model.addAttribute("roleList", roles);
        return "Role/role-list";
    }
    @RequestMapping("/addRoleUI")
    public String addRoleUI() {
        return "Role/role-add";
    }
    @RequestMapping("/addRole")
    public String addRole(SysRole sysRole) {
        roleService.save(sysRole);
        return "redirect:/role/findAllRoles";
    }
}
