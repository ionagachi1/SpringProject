package com.example.springprojectadvanced.injectedinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("boo")
public class OrderBOImpl implements OrderBO{
    @Autowired
    @Qualifier("daoo")
    private OrderDAO dao;

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }

    @Override
    public void placeOrder(){
        System.out.println("Inside Order BO placeOrder()");
        dao.createOrder();
    }
}
