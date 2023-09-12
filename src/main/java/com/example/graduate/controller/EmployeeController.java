package com.example.graduate.controller;

import com.example.graduate.model.Employee;

import com.example.graduate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/getListEmployee")
    List<Employee> getListEmployee(){
        return employeeService.getListEmployee();
    }

    @GetMapping("/getEmployeeById")
    Employee getEmployeeById(@RequestParam int id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping("/createEmployee")
    Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    @PutMapping("/updateEmployee")
    Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/deleteEmployee")
    void deleteEmployee(@RequestParam int id){
         employeeService.deleteEmployee(id);

    }



}
