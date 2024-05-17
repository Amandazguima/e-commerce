package com.ecommerce.model;

import com.ecommerce.model.order.Order;
import com.ecommerce.model.order.Status;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Email {

    private String from;
    private String to;
    private LocalDate sendAt;
    private Status previousStatus;
    private Status newStatus;
    private Integer idOrder;

    public Email( String to, Status newStatus, Integer idOrder, Status previousStatus) {
        this.from = "ecommerce@email.com";
        this.to = to;
        this.sendAt = LocalDate.now();
        this.newStatus = newStatus;
        this.idOrder = idOrder;
        this.previousStatus = previousStatus;
    }

    public String getFrom() {
        this.from = "ecommerce@email.com";
        return from;
    }

    public String getTo() {

        return this.to;
    }


    public Date getSendAt() {
        Date data = new Date();
        data.getTime();
        return data;
    }


    public Status getPreviousStatus(Order order) {
        this.previousStatus = order.getStatus();
        return previousStatus;
    }


    public Status getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Status newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getIdOrder(Order id) {
        this.idOrder = id.getId();
        return idOrder;
    }
}
