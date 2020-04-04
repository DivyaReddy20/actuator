package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "Empcrud")
	public class Employee implements Serializable {
	    @Id
	    @GeneratedValue
	    private Integer id;
	    private String name;
	    
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
	    public Employee(Integer id,String name){
	        this.id=id;
	        this.name=name;
	    }
	    public Employee(){
	    }
	    @Override
	   	public String toString() {
	   		return "Employee [id=" + id + ", name=" + name + "]";
	   	}
	  
	}

