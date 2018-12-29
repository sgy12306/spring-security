package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Product;

public interface ProductService {
    public PageInfo<Product> findAllProducts(int pageNum, int pageSize);

    void save(Product product);

    Product findProductByID(Integer product);

    void updateProduct(Product product);

    void deleteByid(Integer id);
}
