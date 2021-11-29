package com.vishal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishal.model.Order;

public interface OrderRepository extends MongoRepository<Order,Integer> {

}
