package com.komfortcieplny.warstwowa.product.controller;

import com.komfortcieplny.warstwowa.product.controller.dto.ProductNamePriceDto;
import com.komfortcieplny.warstwowa.product.model.Product;
import com.komfortcieplny.warstwowa.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static com.komfortcieplny.warstwowa.product.controller.mapper.ProductMapper.mapToProductNamePriceDto;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/productsNamesAndPrices")
    public List<ProductNamePriceDto> getProductsNamesAndPrices() {
        return mapToProductNamePriceDto(productService.getProducts());
    }
}
