package com.example.graduate.service;

import com.example.graduate.model.Employee;
import com.example.graduate.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getListEmployee(){
        return employeeRepository.getListEmployee();
    }
    @Override
    public Employee getEmployeeById(int id){
        return employeeRepository.getEmployeeById(id);
    }
    @Override
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);

    }
    @Override
    public Employee updateEmployee(Employee employee){
        Employee employeeOld = employeeRepository.getEmployeeById(employee.getId());
        if (employee.getAge()== 0){
            employee.setAge(employeeOld.getAge());
        }
        if (employee.getName()==null){
            employee.setName(employeeOld.getName());
        }
        if (employee.getEmail()==null){
            employee.setEmail(employeeOld.getEmail());
        }
        if (employee.getPhone_number()== 0){
            employee.setPhone_number(employeeOld.getPhone_number());
        }
        if (employee.getImage()==null){
            employee.setImage(employeeOld.getImage());
        }
        return employeeRepository.save(employee);
    }
    @Override
    public void deleteEmployee(int id){
         employeeRepository.deleteById(id);
    }
}
