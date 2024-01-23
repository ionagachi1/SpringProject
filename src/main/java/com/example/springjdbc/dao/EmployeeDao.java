package com.example.springjdbc.dao;

import com.example.springjdbc.dto.Employee;

import java.util.List;

public interface EmployeeDao {
    int create(Employee employee);
    int update(Employee employee);
    int delete(int id);
    Employee read(int id);
    List<Employee> read();

}
