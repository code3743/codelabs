package com.example.demo.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.domain.model.Product;
import com.example.demo.domain.repository.ProductRepository;

@Service
public class GetAllProductsUseCase {
    private final ProductRepository productRepository;

    public GetAllProductsUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> execute() {
        return productRepository.findAll();
    }
}
