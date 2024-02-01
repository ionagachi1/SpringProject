package com.example.springorm.product.dao;

import com.example.springorm.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("productDao")
public class ProductDaoImpl implements ProductDao{
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Product product) {
        Integer result = (Integer)hibernateTemplate.save(product);
        return result;
    }

    @Transactional
    @Override
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Transactional
    @Override
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product find(int id) {
        Product product = hibernateTemplate.get(Product.class,id);
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products =  hibernateTemplate.loadAll(Product.class);
        return products;
    }
}
