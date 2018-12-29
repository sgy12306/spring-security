package com.itheima.service;

import com.itheima.domain.SysRole;

import java.util.List;

public interface RoleService {
    List<SysRole> findAllRoles();

    void save(SysRole sysRole);
}
