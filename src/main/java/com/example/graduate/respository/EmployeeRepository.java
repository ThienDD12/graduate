package com.example.graduate.respository;

import com.example.graduate.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Transactional

    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getListEmployee();

    @Query (value = "select * from employee where id=:id",nativeQuery = true)
    Employee getEmployeeById(@Param("id") int id);




}
