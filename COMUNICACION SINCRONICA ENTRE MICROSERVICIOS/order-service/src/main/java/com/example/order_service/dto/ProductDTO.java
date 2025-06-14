package com.example.order_service.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private Double price;

    public ProductDTO(Long id, String name, Double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override  
    public String toString() {  
        return "ProductoDTO{" +  
                "id=" + id +  
                ", name='" + name + '\'' +  
                ", price=" + price +  
                '}';  
    }  
}
