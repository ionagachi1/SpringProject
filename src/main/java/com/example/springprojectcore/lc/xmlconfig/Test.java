package com.example.springprojectcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springcore/lcXMLconfig.xml");
        Patient patient = (Patient) ctx.getBean("patient");
        System.out.println(patient);
        ctx.registerShutdownHook();
    }
}