package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String id;
    List<Product> productsList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }
}
