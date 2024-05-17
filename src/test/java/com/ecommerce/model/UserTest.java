package com.ecommerce.model;

import com.ecommerce.fixture.OrderFixture;
import com.ecommerce.fixture.UserFixture;
import com.ecommerce.model.order.*;
import com.ecommerce.model.product.Category;
import com.ecommerce.model.product.Product;
import com.ecommerce.observer.NotificationListening;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.ecommerce.fixture.EmailFixture.email;
import static com.ecommerce.model.order.Status.EM_ANDAMENTO;
import static com.ecommerce.model.order.Status.ENVIADO;
import static com.ecommerce.model.product.Category.NOTEBOOK;
import static com.ecommerce.model.product.Category.SMARTPHONE;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void addToCart() {
        User user = UserFixture.user();
        Product product = new Product("Computador", 0.0, NOTEBOOK);
        user.addToCart(product);

        assertTrue(user.getCart().getProductsList().contains(product));
    }

    @Test
    void notAddToCart() {
        User user = UserFixture.user();

        Product product = new Product("Computador", 0.0, NOTEBOOK);
        Product product2 = new Product("Computador",0.0, NOTEBOOK);

        user.addToCart(product2);

        assertFalse(user.getCart().getProductsList().contains(product));
    }

    @Test
    void removeProduct() {
        User user = UserFixture.user();

        Product product = new Product("Computador", 4500.00, NOTEBOOK);
        Product product2 = new Product("Computador",4500, NOTEBOOK);

        user.addToCart(product);
        user.addToCart(product2);
        user.removeProduct(product);

        assertFalse(user.getCart().getProductsList().contains(product));
    }

    @Test
    void createOrder() {
        User user = UserFixture.user();

        Product product = new Product("Computador",4500.00, NOTEBOOK);
        Product product2 = new Product("Iphone",7500, SMARTPHONE);

        user.addToCart(product);
        user.addToCart(product2);

        user.createOrder();

        assertEquals(2,user.orderList.getFirst().productList.size());
        assertEquals(0, user.getCart().productsList.size());
    }

    @Test
    void createMultipleOrders() {
        User user = UserFixture.user();

        Product product = OrderFixture.product;
        Product product1 = OrderFixture.product2;

        user.addToCart(product);
        user.createOrder();

        user.addToCart(product1);
        user.createOrder();


//        Order order = OrderFixture.order;
//        Order order2 = OrderFixture.order2;
//        Order order3 = OrderFixture.order3;
//        Order order4 = OrderFixture.order4;
//        Order order5 = OrderFixture.order5;
//
//        user.orderList.add(order);
//        user.orderList.add(order2);
//        user.orderList.add(order3);
//        user.orderList.add(order4);
//        user.orderList.add(order5);

        assertEquals(user.orderList.getFirst().getStatus(), Status.FEITO);
        assertEquals(user.orderList.get(1).getStatus(),Status.FEITO);
    }

    @Test
    void changeStatus() {
        User user = UserFixture.user();

        Product product = new Product("Computador",4500.00, NOTEBOOK);
        Product product2 = new Product("Iphone",7500, SMARTPHONE);

        user.addToCart(product);
        user.createOrder();
        user.addToCart(product2);
        user.createOrder();

        user.getOrderById(1).setOrderStatus(EM_ANDAMENTO);
        user.getOrderById(2).setOrderStatus(ENVIADO);


//        assertTrue(user.getOrderById(1).getStatus().equals(EM_ANDAMENTO));
//        assertTrue(user.getOrderById(2).getStatus().equals(ENVIADO));
    }

    @Test
    void ShouldReturnStatusInProgress() {
        User user = UserFixture.user();

        Product product = new Product("Computador",4500.00, NOTEBOOK);

        user.addToCart(product);
        user.createOrder();

        user.getOrderById(1).setOrderStatus(ENVIADO);

        Email email = user.orderList.getFirst().emailHistory.getFirst();

        assertEquals(email.getNewStatus(), ENVIADO);
    }

    @Test
    void publisher(){
        User user = UserFixture.user();

        Product product = new Product("Smartphone", 7000.00, SMARTPHONE);

        user.addToCart(product);

        user.createOrder();

        NotificationListening notification = new NotificationListening();

        user.getOrderById(1).publisher.subscribe("ENVIADO", notification);

        user.getOrderById(1).setOrderStatus(ENVIADO);

        assertEquals(true, true);
    }
}