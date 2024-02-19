package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private String id;
    private String orderNumber;
    private double amount;
    List<Product> productList = new ArrayList<>();

    public Order(String id, String orderNumber, Double amount, List<Product> productList) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.amount = amount;
        this.productList = productList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getorderNumber() {
        return orderNumber;
    }

    public void setorderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}
