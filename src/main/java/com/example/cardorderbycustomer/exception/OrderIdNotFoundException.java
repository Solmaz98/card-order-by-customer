package com.example.cardorderbycustomer.exception;

public class OrderIdNotFoundException extends RuntimeException{
    public OrderIdNotFoundException(String message){
        super(message);
    }
}
