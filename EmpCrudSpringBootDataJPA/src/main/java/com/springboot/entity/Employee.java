package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "SpringEmp")
	public class Employee implements Serializable {
	    @Id
	    @GeneratedValue
	    private Integer id;
	    private String name;
	    private int sal;
	    
	    public Integer getId(){
	        return id;
	    }
	   
		public void setId(final Integer id){
	        this.id=id;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    public void setName(final String name){
	        this.name=name;
	    }
	    public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}

		public Employee(Integer id,String name,int sal){
	        this.id=id;
	        this.name=name;
	        this.sal=sal;
	    }
	    public Employee(){
	    }

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
	    
	  
	}

