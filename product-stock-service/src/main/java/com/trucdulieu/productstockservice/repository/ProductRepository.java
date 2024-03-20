package com.trucdulieu.productstockservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trucdulieu.productstockservice.model.entity.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String > {
    Optional<List<Product>> findByRefIn(List<String> productRefs);
}
