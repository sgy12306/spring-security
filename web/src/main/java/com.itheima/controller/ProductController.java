package com.itheima.controller;

import com.github.pagehelper.PageInfo;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService ps;
    @RequestMapping("/findAllProducts")
    public String findAllProducts(Model model, @RequestParam(defaultValue = "1") int pageNum
            ,@RequestParam(defaultValue = "3") int PageSize) {//pageSize
        PageInfo<Product>pageInfo = ps.findAllProducts(pageNum,PageSize);
        model.addAttribute("pageInfo",pageInfo);

        return "product/product-list";
        //?characterEncoding=utf-8
    }
    @RequestMapping("/addProductUI")
    public String addProductUI() {
        return "product/product-add";
    }

    /**
     * 添加用户
     * @param product
     * @return
     */
    @RequestMapping("/save")
    public String save(Product product) {
        ps.save(product);
        return "redirect:/product/findAllProducts";
    }

    /**
     * 更新跳转 使用resultFul风格
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateUI/{id}",method = RequestMethod.POST)
    public String updateUI(@PathVariable("id") Integer id, Model model) {
        Product products = ps.findProductByID(id);
        model.addAttribute("product", products);
        return "product/product-update";
    }

    @RequestMapping("/updateProduct")
    public String updateProduct(Product product) {
        ps.updateProduct(product);
        return "redirect:/product/findAllProducts";
    }
    @RequestMapping("/deleteByid")
    public String deleteByid(Integer id) {
        ps.deleteByid(id);
        return "redirect:/product/findAllProducts";
    }



}
