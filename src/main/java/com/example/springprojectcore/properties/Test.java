package com.example.springprojectcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcore/propertyconfig.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLangs");
        System.out.println(countriesAndLanguages);
    }
}
