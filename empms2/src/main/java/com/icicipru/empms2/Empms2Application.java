package com.icicipru.empms2;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.icicipru.empms2.dto.Department;
import com.icicipru.empms2.dto.Employee;
import com.icicipru.empms2.repo.DepartmentRepository;
import com.icicipru.empms2.services.EmployeeService;

@SpringBootApplication
public class Empms2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Empms2Application.class, args);
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//		Department department = new Department("IT", "IPAMCIT", 50, "Mumbai", null);
//		DepartmentRepository departmentRepository = applicationContext.getBean(DepartmentRepository.class);
//		departmentRepository.save(department);
//		employeeService.addEmployee(new Employee("ipamc9031","Dhruv","Dave", "Mumbai", "1200000","8779642091",department));
//		Optional<Employee> employee = employeeService.getEmployeeById("ipamc9031") ;    
//		System.out.println(employee.get());
		
		
		// Scanner sc = new Scanner(System.in);

//		        while (true) {
//		            System.out.println("Press 1 in order to Add an Employee");
//		            System.out.println("Press 2  in order to Read an Employee by id");
//		            System.out.println("Press 3  in order to Update Employee");
//		            System.out.println("Press 4  in order to Delete Employee");
//		            System.out.println("Press 2  in order tp Exit");
//		            System.out.print("Enter your choice: ");
//		            int choice = sc.nextInt();
//		            sc.nextLine();
//
//		            switch (choice) {
//		                case 1:
//		                	 System.out.print("Enter your employee id: ");
//		                	 String id = sc.nextLine();
//		                	 System.out.print("Enter your first name: ");
//		                	 String fname = sc.nextLine();
//		                	 System.out.print("Enter your last name: ");
//		                	 String lname = sc.nextLine();
//		                	 System.out.print("Enter your city: ");
//		                	 String city = sc.nextLine();
//		                	 System.out.print("Enter your salary: ");
//		                	 String salary = sc.nextLine();
//		                	 System.out.print("Enter your contact number: ");
//		                	 String cNumber = sc.nextLine();
//		                	 employeeService.addEmployee(new Employee(id,fname,lname,city,salary,cNumber,null));
//		                	 System.out.println("employee added successfully...");
//		                	 System.out.println();
//		                    break;
//		                case 2:
//		                	 System.out.println("Enter your id");
//		                	 String empid = sc.nextLine();
//		                	 
//		                    break;
//		                case 3:
//		                    // Read employee id from user, read updated details, and update
//		                    // Call employeeService.updateEmployee(...)
//		                    break;
//		                case 4:
//		                    // Read employee id from user and delete
//		                    // Call employeeService.deleteEmployee(...)
//		                    break;
//		                case 5:
//		                    System.out.println("Exiting...");
//		                    sc.close();
//		                    System.exit(0);
//		                    break;
//		                default:
//		                    System.out.println("Invalid choice.");
//		            }
//		        }
		    }

		
}
