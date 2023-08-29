package com.icicipru.empms2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icicipru.empms2.dto.Department;
import com.icicipru.empms2.services.DepartmentService;
@RequestMapping("/api/dept")
@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;  
	@PostMapping("/create")
	public Department createDepartment(@RequestBody Department department) {
	      return departmentService.addDepartment(department);
}
}