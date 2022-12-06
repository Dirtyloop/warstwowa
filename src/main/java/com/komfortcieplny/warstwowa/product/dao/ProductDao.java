package com.komfortcieplny.warstwowa.product.dao;

import com.komfortcieplny.warstwowa.product.model.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class ProductDao {

    private EntityManager entityManager;

    public ProductDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Product getProduct(Long id) {
        return entityManager.find(Product.class, id);
    }
}
