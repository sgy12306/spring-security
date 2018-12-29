package com.itheima.domain;


import org.springframework.format.annotation.DateTimeFormat;
import untils.DateToStr;

import java.util.Date;

public class Product {
    private Long id;
    private String productNum;
    private String productName;
    private String cityName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date departureTime;

    //因为get方法已经确定了返回值类型为date，所以引用一个成员属性转成字符串
    private String dateString;
    //string 类型丢失小数点
    private double productPrice;
    private String productDesc;
    private Integer productStatus;
    private String productstatusstr;

    public String getProductstatusstr() {
        return this.productStatus.equals(1)?"有效":"无效";
    }

    public void setProductstatusstr(String productstatusstr) {
        this.productstatusstr = productstatusstr;
    }

    public String getdateString() {
        String trantime = DateToStr.DateToString(this.departureTime);
        return trantime;
    }

    public void setdateString(String dateString) {

        this.dateString = dateString;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", productPrice='" + productPrice + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {

        return departureTime;
    }

    /**
     * 设置传入的值
     * @param departureTime
     */
    public void setDepartureTime(Date departureTime) {

        this.departureTime = departureTime;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }
}
