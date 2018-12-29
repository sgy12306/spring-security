package com.itheima.domain;

import untils.DateToStr;

import java.util.Date;

/**
 * @Auther: wyan
 * @Date: 2018/12/21 18:04
 * @Description:
 */
public class Orders {

    private Long id;
    private String orderNum;
    private Date orderTime;
    private Integer peopleCount;
    private String orderDesc;
    private Integer payType;
    private Integer orderStatus;
    private String converstime;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", peopleCount=" + peopleCount +
                ", orderDesc='" + orderDesc + '\'' +
                ", payType=" + payType +
                ", orderStatus=" + orderStatus +
                ", converstime='" + converstime + '\'' +
                ", productID=" + productID +
                ", product=" + product +
                '}';
    }

    private Product productID;

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public String getConverstime() {
        this.setConverstime(DateToStr.DateToString(this.orderTime));
        return converstime;
    }

    public void setConverstime(String converstime) {
        this.converstime = converstime;
    }

    //引入一方的对象属性
    private Product product;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
