package com.example.order_service;

import com.example.order_service.dto.ProductDTO;

public record Order(Long id, ProductDTO product, Integer quantity) {
}
