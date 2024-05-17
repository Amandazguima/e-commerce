package com.ecommerce.model.order;

import com.ecommerce.model.Email;
import com.ecommerce.model.product.Product;
import com.ecommerce.subject.Publisher;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private int id;
    private Status status;
    private String orderNumber;
    private double amount;
    public List<Email> emailHistory = new ArrayList<>();
    public List<Product> productList = new ArrayList<>();



    private static int idStatic = 0;

    public Order(List<Product> productList) {
        this.productList = productList;
        this.id = ++idStatic;
    }

    public Order(String orderNumber, Status status) {
        this.id = ++idStatic;
        this.orderNumber = orderNumber;
        this.productList = productList;
        this.status = status;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getAmount() {
        this.amount = 0;

        for(Product product: productList){
            this.amount += product.getPrice();
        }
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

    public int getId() {
        return id;
    }

    public String getorderNumber() {
        return orderNumber;
    }

    public void setorderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Email> getEmailHistory() {
        return emailHistory;
    }

    public void setEmailHistory(List<Email> emailHistory) {
        this.emailHistory = emailHistory;
    }


}
