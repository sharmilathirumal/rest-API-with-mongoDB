package com.restapiproject.restapiproject.service;

import com.restapiproject.restapiproject.entity.Employee;
import com.restapiproject.restapiproject.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Employee updateEmployee(String id,Employee updatedEmployee){
        Optional<Employee> exsistingemployee = employeeRepository.findById(id);

        if(exsistingemployee.isPresent()){
            Employee employee = exsistingemployee.get();
            employee.setFirst_Name(updatedEmployee.getFirst_Name());
            employee.setLast_Name(updatedEmployee.getLast_Name());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setLocation(updatedEmployee.getLocation());
            return employeeRepository.save(employee);
        }
        else{
            throw new RuntimeException("No Employee peresend with this id:" +id);
        }
    }
}
