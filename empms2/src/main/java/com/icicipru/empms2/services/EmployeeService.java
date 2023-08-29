package com.icicipru.empms2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.icicipru.empms2.dto.Employee;
import com.icicipru.empms2.payload.request.EmployeeRequest;
@Service
public interface EmployeeService {
	public Employee addEmployee (Employee employee);
	public void deleteEmployeeByID(String empId);
	public Optional<Employee> getEmployeeById(String empId);
	public List <Employee> getEmployee();
}
