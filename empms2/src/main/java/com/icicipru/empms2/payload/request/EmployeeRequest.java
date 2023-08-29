package com.icicipru.empms2.payload.request;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonFormat;


import jakarta.persistence.Column;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeRequest {
	private String empId;
	@DateTimeFormat(iso =DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate doj;
	@NotBlank
	private String empFirstName;
	@NotBlank
	private String empLastName;
	@NotBlank
	private String empAddress;
	@NotNull
	private float empSalary;
	@Column(unique = true)
	@NotBlank
	private String contactNumber;
	@NotNull
	@Min(value=21)
	private int age;
	private String departmentId;
	
}
