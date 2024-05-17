package com.ecommerce.model;

import com.ecommerce.fixture.EmailFixture;
import com.ecommerce.fixture.OrderFixture;
import com.ecommerce.fixture.ProductFixture;
import com.ecommerce.fixture.UserFixture;
import com.ecommerce.model.order.Order;
import com.ecommerce.model.order.Status;
import com.ecommerce.model.product.Product;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void getFrom() {
        Email email = EmailFixture.email;
        assertEquals("ecommerce@email.com", email.getFrom());
    }

    @Test
    void getTo() {
        Email email = EmailFixture.email;
        User user = UserFixture.user();
        assertEquals("amandazguima2@gmail.com",email.getTo());

    }

    @Test
    void getSendAt() {
        Email email = EmailFixture.email;
         Date data = new Date();
        assertEquals(new Date(data.getTime()),email.getSendAt());
    }

    @Test
    void getPreviousStatus() {
        Order order = OrderFixture.order;
        Email email = EmailFixture.email;
        assertEquals(Status.ENVIADO,email.getPreviousStatus(order));
    }

    @Test
    void getNewStatus() {
        Order order = OrderFixture.order;
        Email email = EmailFixture.email;
        email.setNewStatus(Status.EM_ANDAMENTO);
        assertEquals(Status.EM_ANDAMENTO, email.getNewStatus());

    }

    @Test
    void getIdOrder() {
        Order order = OrderFixture.order;
        Email email = EmailFixture.email;
        assertEquals(1, email.getIdOrder(order));
    }
}
