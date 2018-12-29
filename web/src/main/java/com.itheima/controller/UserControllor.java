package com.itheima.controller;


import com.itheima.domain.SysRole;
import com.itheima.domain.SysUser;
import com.itheima.service.RoleService;
import com.itheima.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
@Secured("ROLE_ADMIN")
public class UserControllor {
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;
    @RequestMapping("/findAllUser")
    public String findAllUser(Model model) {
        List<SysUser> list = userService.findAllUser();
        model.addAttribute("users", list);
        return "user/user-list";
    }
    @RequestMapping("/addUserUI")
    public String addUserUI() {
        return "user/user-add";
    }

    @RequestMapping("/addUser")
    public String addUser(SysUser sysUser) {
        userService.save(sysUser);
        return "redirect:/user/findAllUser";
    }

    @RequestMapping("/manageUserRoleUI")
    public String manageUserRoleUI(int id, Model model) {
        SysUser sysUser=userService.findUserById(id);
        //页面需要角色表的数据  用户已有的角色回显

        //用户名的回显
        model.addAttribute("user", sysUser);
        //得到用户的所有角色信息
        List<SysRole> roleList = sysUser.getRoleList();
        if (null != roleList && roleList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (SysRole sysRole : roleList) {
                sb.append(sysRole.getRoleName()+",");
            }
            model.addAttribute("roleListStr",sb.toString() );
        }
        List<SysRole> roles = roleService.findAllRoles();
        //由于前台页面无法处理对数组一对一匹配

        model.addAttribute("roles",roles);

        return "/user/manage-user-role";
    }

    @RequestMapping("/manageUserRole")
    public String manageUserRole(int userId, int[] ids) {
        userService.saveRoleAndUser(userId, ids);
        return "redirect:/user/findAllUser";
    }

    @RequestMapping("/userDetail")
    public String userDetail(Model model,int id) {
        SysUser users = userService.findUserById(id);
        model.addAttribute("users", users);
        return "user/user-detial";
    }
}
