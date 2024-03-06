package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Boolean isValid(String username,String password)
    {
        Employee employee = employeeRepository.findByEmployeeUserName(username);
        return employee!=null && employee.getEmployeePassword().equals(password);
    }
}
