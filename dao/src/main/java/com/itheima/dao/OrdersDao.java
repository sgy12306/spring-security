package com.itheima.dao;


import com.itheima.domain.Orders;
import com.itheima.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrdersDao {
    @Select("select * from orders")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            //javaType
            @Result(property = "productID",column = "id",javaType = Product.class,
            one = @One(select = "com.itheima.dao.ProductDao.findProductByID")
            )
    })
    List<Orders> findAllOrders(int i, int pageSize);
    @Select("select count(1) from orders")//startIndex,endIndex
    int findTotalCount();
    @Select("select o.* from (select odd.*,rowNum rn from orders odd)o where o.rn between #{startIndex} and #{endIndex}")
    List<Orders>findAllOrdersByPage(@Param("startIndex") int startIndex, @Param("endIndex") int endIndex);
}
