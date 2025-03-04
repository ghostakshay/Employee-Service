package com.employee.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{

}
