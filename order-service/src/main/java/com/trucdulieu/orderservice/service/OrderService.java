package com.trucdulieu.orderservice.service;

import com.trucdulieu.orderservice.model.dto.OrderDto;

public interface OrderService{
    void createOrder(OrderDto orderDto);
}
