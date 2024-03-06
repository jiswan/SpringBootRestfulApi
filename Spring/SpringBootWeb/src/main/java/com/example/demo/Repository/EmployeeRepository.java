package com.example.demo.Repository;

import com.example.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByEmployeeUserName(String employeeUserName);
}
