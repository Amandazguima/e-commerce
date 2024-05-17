package com.ecommerce.observer;

import com.ecommerce.model.Email;

public class NotificationListening implements Observer {


    @Override
    public void update(String evenType, Email email) {
        System.out.println("Email to " + email.getTo() + "Email status" + email.getNewStatus() );
    }
}
