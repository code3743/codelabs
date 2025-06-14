package com.example.order_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.order_service.dto.ProductDTO;

@FeignClient(name = "product-service")
public interface ProductClient {

    
 
    @GetMapping("/products")
    public List<ProductDTO> getProducts();
}


