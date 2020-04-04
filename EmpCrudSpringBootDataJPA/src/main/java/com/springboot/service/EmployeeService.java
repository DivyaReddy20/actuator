package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.entity.Employee;

public interface EmployeeService {
	   
	    String createEmployee(Employee emp) ;
	    	 
	
	     List<Employee> findAllEmployees();
	    	 
	  
	   String updateEmployee(Employee emp);
	    	
	   
	     Optional<Employee> findEmployee(Integer id);
	    
	 
	     String deleteEmployee(Employee emp) ;
	    	  
		  
}
