package com.ecommerce.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private LocalDate birthday;
    private String cpf;
    private String email;
    private String password;
    private String id;
    private Cart cart;

    public User(String name, LocalDate birthday, String cpf, String email, String password, String id) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.id = id;
        this.cart = cart;
        this.orderList = orderList;
    }
    public User(String name, LocalDate birthday, String cpf, String email, String password, String id, Cart cart, List<Order> orderList) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.id = id;
        this.cart = cart;
        this.orderList = orderList;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    List<Order> orderList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
