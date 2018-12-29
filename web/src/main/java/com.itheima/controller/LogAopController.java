package com.itheima.controller;

import com.itheima.domain.SysLog;
import com.itheima.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import java.security.SecurityPermission;
import java.util.Date;

//配置切面类，生成代理对象
@Component
@Aspect
public class LogAopController {
    @Autowired
    private HttpServletRequest request;
    @Autowired
   private LogService logService;
    private SysLog sysLog;
    //定义切入点
    @Pointcut("execution(* com.itheima.controller.*.*(..))")
    public void pointCut() {
        System.out.println("执行切入点");
    }

    /**
     * @param joinPoint 连接点被执行的方法
     */
    @Before("pointCut()")
    public void executeBefore(JoinPoint joinPoint) {
        sysLog = new SysLog();
        //记录方法执行前
        sysLog.setVisitTime(new Date());
        //从框架的加密用户获取用户名
        SecurityContext context = SecurityContextHolder.getContext();
        User user = (User) context.getAuthentication().getPrincipal();
        sysLog.setUsername(user.getUsername());
        String ip = request.getRemoteAddr();
        sysLog.setIp(ip);
        //获取连接点（正在执行的方法）
        String methodname = joinPoint.getSignature().getName();
        //获得增强类的字节码文件
        Class<?> clazz = joinPoint.getTarget().getClass();
        //或得姓名
        String classname = clazz.getSimpleName();
        //获得权限类名
        sysLog.setMethod(classname+methodname);
    }
    //配置后置通知
    @AfterReturning("pointCut()")
    public  void executeAfter() {
    //获取执行时间
        sysLog.setExecuteTime(new Date().getTime()-sysLog.getVisitTime().getTime());
        sysLog.setExecuteResult("success");
        sysLog.setExecuteMsg("执行成功");
        //执行后插入日志
        logService.saveLog(sysLog);
    }
    @AfterThrowing(pointcut = "pointCut()",throwing = "e")
    public void executeThrowing(Exception e) {
    //对异常进行处理
        sysLog.setExecuteTime(new Date().getTime()-sysLog.getVisitTime().getTime());
        sysLog.setExecuteResult("error");
        sysLog.setExecuteMsg(e.getMessage());
        logService.saveLog(sysLog);
    }


}
