package com.example.springprojectadvanced.standalonecolections;

import com.example.springprojectadvanced.autowiringannotations.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springadvanced/standalonecollectionsconfig.xml");
        ProductsList pl = (ProductsList) ctx.getBean("productsList");
        System.out.println(pl);

    }
}
