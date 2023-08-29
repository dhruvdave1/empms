package com.icicipru.empms2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icicipru.empms2.dto.Employee;
import com.icicipru.empms2.payload.request.EmployeeRequest;
import com.icicipru.empms2.services.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;    
	
	
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody EmployeeRequest employee) {
		      return employeeService.addEmployee(employee);
	}

}
