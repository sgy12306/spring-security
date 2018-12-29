package com.itheima.service;

import com.itheima.domain.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> findAllUser();

    void save(SysUser sysUser);

    SysUser findUserById(int id);

    void saveRoleAndUser(int userId, int[] ids);
}
