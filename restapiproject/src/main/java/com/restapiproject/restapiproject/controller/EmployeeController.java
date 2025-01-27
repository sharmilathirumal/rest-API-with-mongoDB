package com.restapiproject.restapiproject.controller;

import com.restapiproject.restapiproject.entity.Employee;
import com.restapiproject.restapiproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "employee details successfully";
    }

    @PostMapping("/addEmployees")
    public String saveEmployees(@RequestBody List<Employee> employees){
        employeeService.saveAllEmployee(employees);
        return "employees details successfully";
    }

    @GetMapping("/display/{id}")
    public Employee displayEmployee(String id){
       return employeeService.getEmployeeById(id);
    }

    @GetMapping("/displayAll")
    public List<Employee> displayEmployees(){
        return employeeService.getEmployees();
    }

    @PutMapping("/updateDetails/{id}")
    public Employee updateEmployeeDetails(@PathVariable String id,@RequestBody Employee updatedDetails){
      return   employeeService.updateEmployee(id,updatedDetails);
    }
    @DeleteMapping("/deleteEmployeeById/{id}")
    public String deleteEmployeeById(String id){
        employeeService.deleteEmployeeById(id);
        return "employee detail deleted successfully";
    }
}
