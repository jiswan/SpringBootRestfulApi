package com.example.demo.Model;

import jakarta.persistence.*;


@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;


    private String employeeUserName;
    private String employeeDepartment;

    private String employeeEmail;
    private String employeePassword;

    public Employee() {
    }

    public Employee(int id, String employeeUserName, String employeeDepartment, String employeeEmail, String employeePassword) {
        this.id = id;
        this.employeeUserName = employeeUserName;
        this.employeeDepartment = employeeDepartment;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeUserName() {
        return employeeUserName;
    }

    public void setEmployeeUserName(String employeeUserName) {
        this.employeeUserName = employeeUserName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeUserName='" + employeeUserName + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                '}';
    }
}
