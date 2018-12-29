package com.itheima.service;


import com.itheima.domain.Orders;
import untils.PageBean;

public interface ServiceOrder {
    PageBean<Orders> findAllOrdersByPage(int pageNum, int pageSize);
}
