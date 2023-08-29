package com.icicipru.empms2.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity    
@Table(name="dept_table")
public class Department {
//@NotBlank(message ="department name should not be empty")
private String deptName;
@Id
//@NotBlank(message ="department id should not be empty")
private String deptId;
//@NotNull(message ="department size should not be empty")
private int deptSize; 
//@NotBlank(message ="department location should not be empty")
private String location;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
private Set<Employee> employees;
}
