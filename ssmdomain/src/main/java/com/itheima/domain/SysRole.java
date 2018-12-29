package com.itheima.domain;


import java.util.List;

public class SysRole {

    private Integer id;
    private String roleName;
    private String roleDesc;
    private List<SysUser> userList;

    @Override
    public String toString() {
        return "SysRole{" +
                "roleName='" + roleName + '\'' +
                '}';
    }

    public List<SysUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SysUser> userList) {
        this.userList = userList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
