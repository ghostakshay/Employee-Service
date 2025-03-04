package com.employee.employee.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.entity.Employee;
import com.employee.employee.feignclient.EmployeeFeignClient;
import com.employee.employee.model.AddressModel;
import com.employee.employee.model.EmployeeModel;
import com.employee.employee.repository.IEmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	IEmployeeRepo empRepo;
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	EmployeeFeignClient employeeFiegnClient;
	
	public EmployeeModel getEmployeeById(int id) {
		Employee employee = empRepo.findById(id).get();
		EmployeeModel employeeModel = modelMapper.map(employee, EmployeeModel.class) ;
		AddressModel addressModel = employeeFiegnClient.getAddressByEmployeeId(id);
		employeeModel.setAddressModel(addressModel);
		return employeeModel;
	}
}
