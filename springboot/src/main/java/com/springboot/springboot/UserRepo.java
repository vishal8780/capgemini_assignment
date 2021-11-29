package com.springboot.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo  extends MongoRepository<user, String> {

} 
	


