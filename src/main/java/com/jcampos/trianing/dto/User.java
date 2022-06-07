package com.jcampos.trianing.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class User {
	
	@Size(min = 4, message = "Name should be at least 4 characters")
	private String name;
	
	@Email(message = "Please enter valid email")
	private String email;
	
	@Min(value = 1000, message = "Salary should be more than 1000")
	private Double salary;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
