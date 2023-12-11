package com.example.springprojectcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("springcore/setconfig.xml");
        CarDealer dealer = (CarDealer) context.getBean("cardealer");
        System.out.println(dealer.getName());
        System.out.println(dealer.getModels());
    }
}
