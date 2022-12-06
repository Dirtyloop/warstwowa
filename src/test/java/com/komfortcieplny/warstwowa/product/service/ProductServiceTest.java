package com.komfortcieplny.warstwowa.product.service;

import com.komfortcieplny.warstwowa.product.model.Product;
import com.komfortcieplny.warstwowa.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @Test
    void shoulReturnExistingProductId() {
        Product product = new Product();
        product.setId(1L);
        when(productRepository.findById(anyLong())).thenReturn(Optional.of(product));

        Product resultProduct = productService.getProduct(1L);
        assertEquals(1L, resultProduct.getId());
    }

    @Test
    void shouldReturnErrorWhenProductNotExist() {
        assertThrows(IllegalArgumentException.class, () -> {
            productService.getProduct(0L);
        }, "Brak produktu o id 0");
    }
}