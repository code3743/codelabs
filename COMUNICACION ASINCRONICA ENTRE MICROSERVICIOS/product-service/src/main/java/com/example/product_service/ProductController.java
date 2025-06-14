package com.example.product_service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/send")
    public String enviarProductos(@RequestBody List<ProductDTO> productos) {
        productService.sendProductList(productos);
        return "Products successfully sent to order-service";
    }
}