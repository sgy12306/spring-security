package com.itheima.service.impl;

import com.itheima.dao.OrdersDao;
import com.itheima.domain.Orders;
import com.itheima.service.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import untils.PageBean;

import java.util.List;

@Service
public class ServiceOrderImpl implements ServiceOrder {
    @Autowired
    private OrdersDao serviceDao;

    @Override
    public PageBean<Orders> findAllOrdersByPage(int pageNum, int pageSize) {
        //查询总数
        int totalCount=serviceDao.findTotalCount();
        PageBean<Orders> pageBean = new PageBean<>();
        pageBean.setTotalCount(totalCount);
        pageBean.setPageNum(pageNum);
        pageBean.setPageSize(pageSize);
        //Integer ceil =(Integer) Math.ceil(totalCount / pageSize);
        Integer totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        Integer startIndex = (pageNum - 1) * pageSize;
        Integer endIndex = (pageNum - 1) * pageSize + pageSize;
        pageBean.setTotalPage(totalPage);
        List<Orders> list = serviceDao.findAllOrdersByPage(startIndex,endIndex);
        pageBean.setList(list);
        return pageBean;
    }
}
