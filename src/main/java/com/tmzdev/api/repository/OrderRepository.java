package com.tmzdev.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tmzdev.api.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{
	

}
