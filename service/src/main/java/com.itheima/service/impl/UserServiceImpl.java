package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.SysRole;
import com.itheima.domain.SysUser;
import com.itheima.service.UserService;
import com.itheima.service.handle.Handlefailure;
import com.itheima.service.handle.UserNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private HttpServletRequest request;
    @Override
    public List<SysUser> findAllUser() {

        List<SysUser> list = userDao.findAllUser();
        return list;
    }

    @Override
    public void save(SysUser sysUser) {
        String pwd = sysUser.getPassword();
        String encode = passwordEncoder.encode(pwd);

        sysUser.setPassword(encode);
        userDao.save(sysUser);
    }

    @Override
    public SysUser findUserById(int id) {
        SysUser sys = userDao.findUserById(id);
        return sys;
    }

    @Override
    public void saveRoleAndUser(int userId, int[] ids) {
        userDao.deleteRoleByUserId(userId);
        for (int id : ids) {
            userDao.saveRoleAndUser(userId, id);
        }
    }

    //复写框架的认证方法
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, BadCredentialsException {
        //监控service的异常

        SysUser sysUser = userDao.findUserByName(username);


        ArrayList<GrantedAuthority> arrayList = new ArrayList<>();
        //单一授权
        List<SysRole> roleList = sysUser.getRoleList();
        if (null != roleList && roleList.size() > 0) {
            for (SysRole sysRole : roleList) {
                System.out.println(sysRole);
                arrayList.add(new SimpleGrantedAuthority(sysRole.getRoleName()));
            }
        }
        //永久期限用户的返回框架对象
        //User user = new User(sysUser.getUsername(),sysUser.getPassword(), arrayList);
        // 限时权限
        User user = new User(sysUser.getUsername(), sysUser.getPassword(), sysUser.getStatus() == 1, true, true, true, arrayList);
        //将创建的框架封装好的对象的密码与前台的密码进行对比
        return user;

    }
}
