package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.domain.SysRole;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<SysRole> findAllRoles() {
        List<SysRole>list=roleDao.findAllRoles();
        return list;
    }

    @Override
    public void save(SysRole sysRole) {
        roleDao.save(sysRole);
    }
}
