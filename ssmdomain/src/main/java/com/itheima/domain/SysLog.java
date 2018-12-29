package com.itheima.domain;

import java.util.Date;

/**
 * @Auther: wyan
 * @Date: 2018/12/26 17:57
 * @Description:
 */
public class SysLog {

    private Long id;
    private Date visitTime;
    private String username;
    private String ip;
    private String method; //类名+方法名
    private String executeResult ;//执行结果 success/exception
    private String executeMsg  ;//执行成功 /异常信息
    private Long   executeTime;//执行的时间


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getExecuteResult() {
        return executeResult;
    }

    public void setExecuteResult(String executeResult) {
        this.executeResult = executeResult;
    }

    public String getExecuteMsg() {
        return executeMsg;
    }

    public void setExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
    }

    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }
}
