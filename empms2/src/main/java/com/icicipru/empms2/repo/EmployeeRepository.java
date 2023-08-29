package com.icicipru.empms2.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icicipru.empms2.dto.Employee;
import com.icicipru.empms2.payload.request.EmployeeRequest;
@Repository
public interface EmployeeRepository extends 
JpaRepository<EmployeeRequest,String > {

}    
