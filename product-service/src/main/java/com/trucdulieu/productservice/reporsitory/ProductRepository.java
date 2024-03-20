package com.trucdulieu.productservice.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trucdulieu.productservice.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
