package com.jcampos.trianing.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jcampos.trianing.dto.ResponseDTO;

@ControllerAdvice
public class AssessmentControllerAdvice extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> errors = new ArrayList<String>();
		ResponseDTO response = new ResponseDTO();

		ex.getFieldErrors().forEach(f -> errors.add(f.getDefaultMessage()));
		response.setErrors(errors);
		response.setStatus("ERROR");

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	 
}
