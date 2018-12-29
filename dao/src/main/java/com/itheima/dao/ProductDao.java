package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface ProductDao {
    @Select("select * from product")
    public List<Product> findAllProducts();
    @Insert("insert into product values(common_sequence.nextval,#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
    @Select("select * from product where id=#{id}")
    Product findProductByID(Integer id);
    @Update("update product set productName=#{productName},cityName=#{cityName}," +
            " departureTime=#{departureTime},productPrice=#{productPrice}," +
            " productDesc=#{productDesc},productStatus=#{productStatus} where id = #{id}")
    void updateProduct(Product product);
    @Delete("delete from product where id=#{id}")
    void deleteByid(Integer id);
}
