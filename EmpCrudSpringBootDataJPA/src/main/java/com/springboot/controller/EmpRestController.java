package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

	@RestController
	@RequestMapping("/Employee")
	@CrossOrigin("http://localhost:4200")
		public class EmpRestController {
		
		    @Autowired
		    EmployeeService empService;
	      @PostMapping("/CreateEmployee")
	      public String createEmployee(@RequestBody Employee emp) {
	    	  return empService.createEmployee(emp);
	      }
	      @GetMapping("/findAllEmployees")
	      public List<Employee> findAllEmployees(){
	    	  return empService.findAllEmployees();
	      }
	      @PutMapping("/updateEmployee")
	      public String updateEmployee(@RequestBody Employee emp) {
	    	  return empService.updateEmployee(emp);
	      }
	      @GetMapping("/findEmployee/{id}")
	      public Optional<Employee> findEmployee(@PathVariable Integer id){
	    	  return empService.findEmployee(id);
	      }
	      @DeleteMapping("/deleteEmp/{id}")
	      public String deleteEmployee(@PathVariable Employee emp) {
	    	  return empService.deleteEmployee(emp);
	      }
		  
	}


