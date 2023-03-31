package com.springmongo.api.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.api.model.Employees;

public interface EmployeeRepository extends MongoRepository<Employees,Integer>{


}
