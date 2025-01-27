package com.restapiproject.restapiproject.repository;

import com.restapiproject.restapiproject.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
