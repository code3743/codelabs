package com.example.demo.application.usecase;

import org.springframework.stereotype.Service;


import com.example.demo.domain.model.Product;
import com.example.demo.domain.repository.ProductRepository;

@Service
public class FindProductByIdUseCase {
    
 
    private final ProductRepository productRepository;

    public FindProductByIdUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product execute(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
