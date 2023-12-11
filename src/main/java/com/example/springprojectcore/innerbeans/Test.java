package com.example.springprojectcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springcore/innerbeansconfig.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee.hashCode());

        Employee employee2 = (Employee) ctx.getBean("employee");
        System.out.println(employee2.hashCode());
    }
}
