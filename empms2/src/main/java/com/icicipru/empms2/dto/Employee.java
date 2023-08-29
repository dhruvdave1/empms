package com.icicipru.empms2.dto;

import java.time.LocalDate;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "emp_table")
public class Employee {
@Id
@NotBlank()
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
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="deptId",nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
private Department department;
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
			+ ", empAddress=" + empAddress + ", empSalary=" + empSalary + ", contactNumber=" + contactNumber +"]";
}

}
