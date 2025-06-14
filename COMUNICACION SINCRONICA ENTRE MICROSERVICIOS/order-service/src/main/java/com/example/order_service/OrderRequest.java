package com.example.order_service;

public record OrderRequest(Long productId, Integer quantity) {
}
