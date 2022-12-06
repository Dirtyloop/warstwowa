package com.komfortcieplny.warstwowa.product.repository;

import com.komfortcieplny.warstwowa.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
