package com.icicipru.empms2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icicipru.empms2.dto.Employee;
import com.icicipru.empms2.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeService employeeService;
	@Autowired
	private EmployeeRepository employeeRepository;
	private EmployeeServiceImpl() {
		
	}
	public static EmployeeService getInstance(){
		if (employeeService== null) {
			employeeService = new EmployeeServiceImpl();
		}
		return employeeService;   
		
	}
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		    return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeByID(String empId) {
		employeeRepository.deleteById(empId);
		 return;
	}


	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId);
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
