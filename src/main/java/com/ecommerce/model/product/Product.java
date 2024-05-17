package com.ecommerce.model.product;

public class Product {
    final private int id;
    private String name;
    private double price;


private Category category;

    private static int idStatic = 0;

    public Product(String name,double price, Category category) {
        this.id = ++idStatic;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
