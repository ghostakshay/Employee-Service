package com.employee.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.model.EmployeeModel;
import com.employee.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empSerivce;

	@GetMapping("/getEmployees/{id}")
	public EmployeeModel getEmployeeById(@PathVariable("id") int id) {
		EmployeeModel employee = empSerivce.getEmployeeById(id);
		return employee;
	}
}
