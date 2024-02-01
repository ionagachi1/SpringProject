package com.example.springjdbc;

import com.example.springjdbc.dao.EmployeeDao;
import com.example.springjdbc.dao.EmployeeDaoImpl;
import com.example.springjdbc.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc/springjdbcannotations.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
        Employee emp = new Employee();
        emp.setId(2);
        emp.setFirstName("Ion2");
        emp.setLastName("Agachi2");
        //int result = dao.create(emp);
        //int result = dao.update(emp);
        //int result = dao.delete(1);
        Employee employee = dao.read(2);
        System.out.println("Employee record: "+employee);

        List<Employee> result = dao.read();
        System.out.println("Employee record: "+result);

    }
}
