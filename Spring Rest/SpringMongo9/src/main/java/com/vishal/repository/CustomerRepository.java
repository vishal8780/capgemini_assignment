package com.vishal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishal.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

}
