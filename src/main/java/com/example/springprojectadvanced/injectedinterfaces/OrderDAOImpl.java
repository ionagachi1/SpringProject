package com.example.springprojectadvanced.injectedinterfaces;

import org.springframework.stereotype.Component;

@Component("daoo")
public class OrderDAOImpl implements OrderDAO{

    @Override
    public void createOrder() {
        System.out.println("Inside order DAO createOrder()");
    }
}
