package com.example.order_service;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/create")
    public String createOrder() {
        return "The order is being processed and will be received as soon as the asynchronous message arrives.";
    }
}
