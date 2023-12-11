package com.example.springprojectcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springcore/reftypesconfig.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }
}
