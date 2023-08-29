package com.icicipru.empms2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.icicipru.empms2.dto.Department;
@Service
public interface DepartmentService {
	public Department addDepartment (Department department);
	public void deleteDepartmentById(String deptId);
	public Optional<Department> getDepartmentById(String deptId);
	public List <Department> getDepartment();
}
