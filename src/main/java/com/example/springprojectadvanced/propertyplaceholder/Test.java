package com.example.springprojectadvanced.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springcore/propertydbconfig.xml");
        MyDAO dao = (MyDAO)ctx.getBean("myDAO");
        System.out.println(dao);

    }
}
