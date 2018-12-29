package com.itheima.controller;
import com.itheima.domain.Orders;
import com.itheima.service.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import untils.PageBean;

@Controller
@RequestMapping("/order")
public class OrderControllor {
    @Autowired
    private ServiceOrder serviceOrder;
    @RequestMapping("/findAllOrders")
    public String findAllOrders(Model model,
        @RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "3")int pageSize) {
        PageBean<Orders>pageBean = serviceOrder.findAllOrdersByPage(pageNum,pageSize);
        model.addAttribute("pageBean",pageBean);
        return "order/orderList";
    }

}
