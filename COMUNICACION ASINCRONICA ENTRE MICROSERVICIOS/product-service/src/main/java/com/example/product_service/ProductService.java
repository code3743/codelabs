package com.example.product_service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;
@Service
public class ProductService {
Logger logger = Logger.getLogger(getClass().getName());
    private final AmqpTemplate customRabbitTemplate;

    public ProductService(AmqpTemplate customRabbitTemplate) {
        this.customRabbitTemplate = customRabbitTemplate;
    }

    public void sendProductList(List<ProductDTO> productos) {
        customRabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME,
            RabbitMQConfig.ROUTING_KEY,
            productos
        );
        logger.info("Product list successfully sent in JSON format.");
    }
}