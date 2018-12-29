package com.itheima.dao;

import com.itheima.domain.SysRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleDao {
    @Select("select * from sys_role ")
    List<SysRole> findAllRoles();
    @Insert("insert into sys_role values(common_sequence.nextval,#{roleName},#{roleDesc})")
    void save(SysRole sysRole);
    //用户表查出id来角色表
    @Select("select * from sys_role where id in(select roleid from sys_user_role where userid=#{userId})")
    List<SysRole> findRolesByUserId(int userId);
}
