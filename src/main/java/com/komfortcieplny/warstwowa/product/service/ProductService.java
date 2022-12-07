package com.komfortcieplny.warstwowa.product.service;

import com.komfortcieplny.warstwowa.product.dao.ProductDao;
import com.komfortcieplny.warstwowa.product.model.Product;
import com.komfortcieplny.warstwowa.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("Brak produktu o id " + id);
        });
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
