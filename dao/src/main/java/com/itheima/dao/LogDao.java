package com.itheima.dao;

import com.itheima.domain.SysLog;
import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    @Insert("insert into sys_log values(common_sequence.nextval," +
            "#{visitTime},#{username},#{ip}," +
            "#{method},#{executeResult},#{executeMsg}," +
            "#{executeTime})")
    public void savelog(SysLog sysLog);
}
