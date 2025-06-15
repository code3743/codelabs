package com.example.demo.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Product;
import com.example.demo.domain.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
