package com.example.demo.delivery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.usecase.FindProductByIdUseCase;
import com.example.demo.application.usecase.GetAllProductsUseCase;
import com.example.demo.domain.model.Product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/products")
public class ProductController {

    private final GetAllProductsUseCase getAllProductsUseCase;
    private final FindProductByIdUseCase findProductByIdUseCase;
    public ProductController(GetAllProductsUseCase getAllProductsUseCase, FindProductByIdUseCase findProductByIdUseCase) {
        this.getAllProductsUseCase = getAllProductsUseCase;
        this.findProductByIdUseCase = findProductByIdUseCase;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return getAllProductsUseCase.execute();
    }
    

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return findProductByIdUseCase.execute(id);
    }
}
