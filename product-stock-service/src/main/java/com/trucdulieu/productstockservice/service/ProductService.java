package com.trucdulieu.productstockservice.service;

import java.util.List;

import com.trucdulieu.productstockservice.model.dto.CreateProductDto;
import com.trucdulieu.productstockservice.model.dto.ProductStockResponseDto;

public interface ProductService {
    //ProductResponseDto getById(Long id);
    void create(CreateProductDto createProductDto);
    ProductStockResponseDto checkProductsStock(List<String> productRefs);
    //List<ProductResponseDto> getProducts();
}
