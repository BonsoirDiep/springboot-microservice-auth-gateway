package com.trucdulieu.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trucdulieu.orderservice.model.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
