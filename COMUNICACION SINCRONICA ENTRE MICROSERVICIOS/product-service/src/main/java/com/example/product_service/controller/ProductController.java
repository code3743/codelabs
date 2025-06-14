package com.example.product_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.product_service.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    private final List<Product> products = List.of(
        new Product(1L, "Product A", 10.0),
        new Product(2L, "Product B", 20.0),
        new Product(3L, "Product C", 30.0),
        new Product(4L, "Product D", 40.0),
        new Product(5L, "Product E", 50.0)
        
    );

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return products.stream()
                       .filter(product -> product.id().equals(id))
                       .findFirst()
                       .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));   
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

}
