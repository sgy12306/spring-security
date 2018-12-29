package com.itheima.dao;


import com.itheima.domain.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Select("select * from sys_user")
    List<SysUser> findAllUser();
    @Insert("insert into sys_user values(common_sequence.nextval,#{username},#{email},#{password},#{phoneNum},#{status})")
    void save(SysUser sysUser);
    //根据用户名查询它的角色
    @Select("select * from sys_user where username=#{username}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "id",property = "roleList",javaType = List.class,
            many = @Many(select = "com.itheima.dao.RoleDao.findRolesByUserId")
            )
    })
    SysUser findUserByName(String username);
    //根据用户id查询中间表的角色id，在查询角色表  一个用户的多个角色
    @Select("select * from sys_user where id=#{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "id",property = "roleList",javaType = List.class,
            many = @Many(select = "com.itheima.dao.RoleDao.findRolesByUserId")
            )
    })
    SysUser findUserById(int id);
    @Insert("insert into sys_user_role values(#{userid},#{roleid})")
    void saveRoleAndUser(@Param("userid") int userId,@Param("roleid") int roleid);
    @Delete("delete from sys_user_role where userid=#{userId}")
    void deleteRoleByUserId(int userId);
}
