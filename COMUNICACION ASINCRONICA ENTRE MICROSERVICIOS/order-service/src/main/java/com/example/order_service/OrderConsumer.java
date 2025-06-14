package com.example.order_service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class OrderConsumer {
    final Logger logger = Logger.getLogger(getClass().getName());
    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveProductList(List<ProductDTO> products) {
        
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Order received with the following products: %s", products));
        }
    }
}