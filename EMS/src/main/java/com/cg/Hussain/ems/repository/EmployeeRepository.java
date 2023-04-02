package com.cg.Hussain.ems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.Hussain.ems.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer > 
{

	
}
