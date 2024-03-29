package com.example.springjdbc.dao;

import com.example.springjdbc.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getInt(1));
        emp.setFirstName(rs.getString(2));
        emp.setLastName(rs.getString(3));
        return emp;
    }
}
