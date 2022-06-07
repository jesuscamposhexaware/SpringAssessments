package com.jcampos.trianing.dto;

import java.util.List;

public class ResponseDTO {
	
	private String status;
	private List<String> errors;
	
	public String getStatus() {
		return status;
	}
	
	public List<String> getErrors() {
		return errors;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
