package com.vishal.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vishal.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
