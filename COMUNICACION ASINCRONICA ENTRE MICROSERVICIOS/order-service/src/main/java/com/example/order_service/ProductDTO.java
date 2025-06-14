package com.example.order_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
   
}
