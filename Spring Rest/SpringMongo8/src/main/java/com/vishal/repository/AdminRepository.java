package com.vishal.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishal.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
