package com.ecommerce.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private LocalDate birthday;
    private String cpf;
    private String email;
    private String password;
    private String id;
    private Cart cart;
    List<Order> orderList = new ArrayList<>();

    public User(String name, LocalDate birthday, String cpf, String email, String password, String id) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.id = id;
    }
    public User(String name, LocalDate birthday, String cpf, String email, String password, String id, Cart cart) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.id = id;
        this.cart = cart;
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



    public Product addToCart(Product product){
        this.cart.productsList.add(product);
        return product;
    }

    public List<Product> getProducts(){
        return this.cart.productsList;
    }

    public List<Product> removeProduct(Product product){
       this.cart.productsList.remove(product);
       return cart.productsList;
    }


    public void createOrder() {
        // orderList - Novo Pedido
        List<Product> productsListCopy = List.copyOf(cart.productsList);
        Order order = new Order(productsListCopy);
        this.orderList.add(order);
        this.cart.productsList.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(birthday, user.birthday) && Objects.equals(cpf, user.cpf) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(id, user.id) && Objects.equals(cart, user.cart) && Objects.equals(orderList, user.orderList);
    }

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
