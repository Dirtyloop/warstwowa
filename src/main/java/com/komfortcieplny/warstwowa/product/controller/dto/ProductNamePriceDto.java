package com.komfortcieplny.warstwowa.product.controller.dto;

import java.math.BigDecimal;

public class ProductNamePriceDto {
    private String name;
    private BigDecimal price;

    public ProductNamePriceDto(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
