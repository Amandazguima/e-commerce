package com.ecommerce.observer;

import com.ecommerce.model.Email;
import com.ecommerce.model.order.Order;

public interface Observer {

    void update(String evenType, Email email);
}
