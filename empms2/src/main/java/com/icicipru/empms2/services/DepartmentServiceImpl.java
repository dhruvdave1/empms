package com.icicipru.empms2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icicipru.empms2.dto.Department;
import com.icicipru.empms2.repo.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
//	private static DepartmentService departmentService;
	@Autowired
	private DepartmentRepository departmentRepository;
	private DepartmentServiceImpl() {
		
	}
//	public static DepartmentService getInstance(){
//		if (departmentService== null) {
//			departmentService = new DepartmentServiceImpl();
//		}
//		return departmentService;   
//		
//	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	@Override
	public void deleteDepartmentById(String deptId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(deptId);
		return;
	}


	@Override
	public Optional<Department> getDepartmentById(String deptId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(deptId);
	}
	@Override
	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

}
