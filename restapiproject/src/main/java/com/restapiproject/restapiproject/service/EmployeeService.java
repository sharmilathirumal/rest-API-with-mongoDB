package com.restapiproject.restapiproject.service;

import com.restapiproject.restapiproject.entity.Employee;
import com.restapiproject.restapiproject.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void  saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public  void saveAllEmployee(List<Employee> employees){
        employeeRepository.saveAll(employees);
    }

    public Employee getEmployeeById(String id){
      return  employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployeeById(String id){
        employeeRepository.deleteById(id);
    }

}
