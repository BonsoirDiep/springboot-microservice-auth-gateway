package com.trucdulieu.productservice.service;

import java.util.List;

import com.trucdulieu.productservice.model.dto.ProductRequestDto;
import com.trucdulieu.productservice.model.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto getById(Long id);
    void create(ProductRequestDto productRequestDto);
    List<ProductResponseDto> getProducts();
}
