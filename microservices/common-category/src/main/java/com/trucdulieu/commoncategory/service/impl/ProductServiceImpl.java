package com.trucdulieu.commoncategory.service.impl;

import com.trucdulieu.commoncategory.model.dto.ProductRqDto;
import com.trucdulieu.commoncategory.model.dto.ProducDto;
import com.trucdulieu.commoncategory.model.entity.Product;
import com.trucdulieu.commoncategory.reporsitory.ProductRepository;
import com.trucdulieu.commoncategory.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

// @lombok.extern.slf4j.Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    @Override
    public ProducDto getById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent()){
            return null;
        }
        return mapToDto(product.get());
    }

    @Override
    public ProducDto create(ProductRqDto productRequestDto){
        Product product = Product.builder()
                .ref(UUID.randomUUID().toString())
                .name(productRequestDto.getName())
                .price(productRequestDto.getPrice())
                .stockCount(productRequestDto.getStockCount())
                .inStock(productRequestDto.getInStock())
                .build();

        productRepository.save(product);

        ProducDto productDto = ProducDto.builder()
                .ref(product.getRef())
                .name(product.getName())
                .price(product.getPrice())
                .stockCount(product.getStockCount())
                .inStock(product.getInStock())
                .build();
        return productDto;
    }

    @Override
    public List<ProducDto> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    private ProducDto mapToDto(Product product){
        return ProducDto.builder()
                .ref(product.getRef())
                .name(product.getName())
                .price(product.getPrice())
                .stockCount(product.getStockCount())
                .inStock(product.getInStock())
                .build();
    }
}
