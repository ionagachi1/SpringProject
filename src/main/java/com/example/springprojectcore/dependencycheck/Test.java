package com.example.springprojectcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springcore/dependencycheckconfig.xml");
        Prescription prescription =  (Prescription) ctx.getBean("prescription");
        System.out.println(prescription);



    }
}