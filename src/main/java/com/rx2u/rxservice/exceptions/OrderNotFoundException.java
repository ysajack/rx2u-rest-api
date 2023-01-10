package com.rx2u.rxservice.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String orderNumber) {
        super("Order Number " + orderNumber +" not found!");
    }
}
