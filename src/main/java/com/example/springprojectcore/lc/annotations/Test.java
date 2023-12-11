package com.example.springprojectcore.lc.annotations;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springcore/lcannotationsconfig.xml");
        Patient patient =  (Patient) ctx.getBean("patient");
        System.out.println(patient);
        ctx.registerShutdownHook();
    }
}