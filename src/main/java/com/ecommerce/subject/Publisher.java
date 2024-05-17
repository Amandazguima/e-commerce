package com.ecommerce.subject;

import com.ecommerce.model.Email;
import com.ecommerce.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher implements Subject {

    Map<String, List<Observer>> listeners = Map.of("ENVIADO", new ArrayList<>() );


    @Override
    public void subscribe(String evenType, Observer listener) {
        List<Observer> observerList = this.listeners.get(evenType);

        observerList.add(listener);
    }

    @Override
    public void unsubscribe(String evenType, Observer listener) {
        List<Observer> observerList = this.listeners.get(evenType);
        observerList.remove(listener);
    }

    @Override
    public void notify(String evenType, Email email) {
        List<Observer> observerList = this.listeners.get(evenType);

        for(Observer o: observerList){
            o.update(evenType,email);
        }
    }
}
