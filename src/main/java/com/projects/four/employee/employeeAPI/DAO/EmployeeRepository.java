package com.projects.four.employee.employeeAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.four.employee.employeeAPI.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
