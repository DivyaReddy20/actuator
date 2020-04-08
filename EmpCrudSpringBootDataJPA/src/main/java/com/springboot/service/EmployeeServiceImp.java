package com.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeDao;
import com.springboot.entity.Employee;

    @Service
	@Transactional
	public class EmployeeServiceImp implements EmployeeService {

	    @Autowired
	    private EmployeeDao dao;

	    public EmployeeDao getDao(){
	        return dao;
	    }

		@Override
		public String createEmployee(Employee emp) {
			dao.save(emp);
			return "registered successfully";
		}

		@Override
		public List<Employee> findAllEmployees() {
			List<Employee> emp= dao.findAll();
			return emp;
		}

		@Override
		public String updateEmployee(Employee emp) {
			boolean result=dao.exists(emp.getId());
			if(result) {
				dao.save(emp);
				return "updated the emp details";
			}
			
			return "id is not present";
		}

		@Override
		public Optional<Employee> findEmployee(Integer id) {
		
			return dao.findById(id);
					}

		@Override
		public String deleteEmployee(Employee emp) {
			boolean result=dao.existsById(emp.getId());
			if(result) {
				dao.delete(emp);
				return "deleted the emp details";
			}
			else 
				return "id is not present";
		}

	
}
