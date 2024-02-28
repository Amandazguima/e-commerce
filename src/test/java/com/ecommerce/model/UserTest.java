package com.ecommerce.model;

import com.ecommerce.fixture.UserFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void addToCart() {
        User user = UserFixture.user();
        Product product = new Product("Computador", "0",4500.00);
        user.addToCart(product);

        assertTrue(user.getCart().getProductsList().contains(product));
    }

    @Test
    void notAddToCart() {
        User user = UserFixture.user();

        Product product = new Product("Computador", "0",4500.00);
        Product product2 = new Product("Computador","0",4500);

        user.addToCart(product2);

        assertFalse(user.getCart().getProductsList().contains(product));
    }

    @Test
    void removeProduct() {
        User user = UserFixture.user();

        Product product = new Product("Computador", "0",4500.00);
        Product product2 = new Product("Computador","0",4500);

        user.addToCart(product);
        user.addToCart(product2);
        user.removeProduct(product);

        assertFalse(user.getCart().getProductsList().contains(product));
    }

    @Test
    void closeCart() {
        User user = UserFixture.user();

        Product product = new Product("Computador", "0",4500.00);
        Product product2 = new Product("Iphone","1",7500);

        user.addToCart(product);
        user.addToCart(product2);

        user.createOrder();

        assertEquals(2,user.orderList.getFirst().productList.size());
        assertEquals(0, user.getCart().productsList.size());
    }
}