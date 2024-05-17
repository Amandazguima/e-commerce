package com.ecommerce.subject;

import com.ecommerce.model.Email;
import com.ecommerce.observer.Observer;

public interface Subject {

    void subscribe(String evenType, Observer listening);
    void unsubscribe(String evenType, Observer listening);

    void notify(String evenType, Email email);

}
