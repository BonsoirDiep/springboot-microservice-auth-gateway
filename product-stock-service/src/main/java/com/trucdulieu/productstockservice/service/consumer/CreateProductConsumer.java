package com.trucdulieu.productstockservice.service.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trucdulieu.productstockservice.model.dto.CreateProductDto;
import com.trucdulieu.productstockservice.service.ProductService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CreateProductConsumer {

    private final ProductService productService;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "create.product", groupId = "product-id")
    public void handleCreateProduct(String createProductEventMessage) throws JsonProcessingException {
        log.info("create product event consumed {}", createProductEventMessage);

        CreateProductDto createProductDto = objectMapper.readValue(createProductEventMessage, CreateProductDto.class);
        productService.create(createProductDto);
    }
}
