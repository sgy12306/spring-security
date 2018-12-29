package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao pd;

    public PageInfo<Product> findAllProducts(int pageNum, int pageSize) {
        //在执行分页查询前开启pagehelper的静态方法
        PageHelper.startPage(pageNum,pageSize);
        List<Product> list = pd.findAllProducts();
        //pageHelper会自动组装拼接
        PageInfo<Product> pageInfo = new PageInfo<Product>(list,5);
        return pageInfo;
    }

    @Override
    public void save(Product product) {
        pd.save(product);
    }

    @Override
    public Product findProductByID(Integer id) {
        Product product1=pd.findProductByID(id);
        return product1;
    }

    @Override
    public void updateProduct(Product product) {
        pd.updateProduct(product);
    }

    @Override
    public void deleteByid(Integer id) {
        pd.deleteByid(id);
    }
}
