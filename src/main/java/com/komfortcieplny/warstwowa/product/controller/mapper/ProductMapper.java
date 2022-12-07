package com.komfortcieplny.warstwowa.product.controller.mapper;

import com.komfortcieplny.warstwowa.product.controller.dto.ProductNamePriceDto;
import com.komfortcieplny.warstwowa.product.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static List<ProductNamePriceDto> mapToProductNamePriceDto(List<Product> products) {
        return products.stream()
                .map(product -> new ProductNamePriceDto(product.getName(), product.getPrice()))
                .collect(Collectors.toList());
    }
}
