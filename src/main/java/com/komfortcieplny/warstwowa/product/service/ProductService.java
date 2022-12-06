package com.komfortcieplny.warstwowa.product.service;

import com.komfortcieplny.warstwowa.product.dao.ProductDao;
import com.komfortcieplny.warstwowa.product.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Product getProduct(Long id) {
        Product product = productDao.getProduct(id);
        if(product != null) {
            return product;
        } else {
            throw new IllegalArgumentException("Brak produktu o id " + id);
        }
    }
}
