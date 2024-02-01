package com.example.springorm;

import com.example.springorm.product.dao.ProductDao;
import com.example.springorm.product.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springorm/springorm.xml");
        ProductDao productDao = (ProductDao)context.getBean("productDao");
        //Product product = new Product();
        //product.setId(1);
        //product.setName("iPhone");
        //product.setDesc("Awesome");
        //product.setPrice(900);
        //productDao.create(product);
        //productDao.update(product);
        //productDao.delete(product);

        Product product = productDao.find(1);
        System.out.println(product);

        List<Product> products =  productDao.findAll();
        System.out.println(products);

        System.out.println("bbbbbbbbbbbbbbbbbbbbbb");

    }
}
