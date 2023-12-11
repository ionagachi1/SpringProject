package com.example.springprojectadvanced.injectedinterfaces;

import com.example.springprojectadvanced.autowiringannotations.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springadvanced/injectedinterfacesconfig.xml");
        OrderBO bo = (OrderBO) ctx.getBean("boo");
        bo.placeOrder();

    }

}
