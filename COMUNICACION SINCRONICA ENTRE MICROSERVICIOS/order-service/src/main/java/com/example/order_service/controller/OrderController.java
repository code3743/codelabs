package com.example.order_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order_service.client.ProductClient;
import com.example.order_service.dto.ProductDTO;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final ProductClient productClient;
    public OrderController(ProductClient client){
        this.productClient = client;
    }

    @GetMapping("/create")
    public ResponseEntity<String> createOrder(){
        List<ProductDTO> products  = productClient.getProducts();
        return ResponseEntity.ok("Order created: "+ products);
    }
    
}
