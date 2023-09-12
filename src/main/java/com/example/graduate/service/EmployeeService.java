package com.example.graduate.service;

import com.example.graduate.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getListEmployee();
    Employee getEmployeeById(int id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
