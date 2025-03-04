package com.employee.employee.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.employee.model.AddressModel;


@FeignClient(name ="EmployeeFeign" ,url = "http://localhost:8080")
public interface EmployeeFeignClient {
	@GetMapping("/getAddresses/{id}")
	public AddressModel getAddressByEmployeeId(@PathVariable("id") int id);
}
