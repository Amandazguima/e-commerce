package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private String id;

    private String status;
    private String orderNumber;

    private double amount;
    List<Product> productList = new ArrayList<>();

    private static int idStatic = 0;



    public Order(List<Product> productList) {
        this.productList = productList;
    }
    public Order(String orderNumber, String status) {
        this.id = String.valueOf(++idStatic);
        this.orderNumber = orderNumber;
        this.productList = productList;
        this.status = status;
    }

    public enum status {
        FEITO, EM_ANDAMENTO,ENVIADO,FINALIZADO;
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

    public String getStatus(Enum<status> stautsEnum) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
