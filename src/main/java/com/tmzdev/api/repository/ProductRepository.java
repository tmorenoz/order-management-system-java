package com.tmzdev.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tmzdev.api.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

}
