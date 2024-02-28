package com.ecommerce.model;

import com.ecommerce.fixture.OrderFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getAmount() {
        Order order = OrderFixture.order;

        Product product = OrderFixture.product;
        Product product2 = OrderFixture.product2;

        order.productList.add(product);
        order.productList.add(product2);

        assertEquals(7500, order.getAmount());
    }

    @Test
    void getId(){

        Order order = OrderFixture.order;
        Order order2 = OrderFixture.order2;

        assertEquals(order.getId(), "1");
        assertEquals(order2.getId(), "2");
    }

}