package com.example.springprojectadvanced.stereotypeannotations;

import com.example.springprojectadvanced.standalonecolections.ProductsList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springadvanced/stereotypeannotations.xml");
        Instructor ins = (Instructor) ctx.getBean("instr");
        System.out.println(ins);

    }
}
