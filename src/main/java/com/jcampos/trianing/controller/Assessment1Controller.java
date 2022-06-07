package com.jcampos.trianing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jcampos.trianing.dto.ErrorResponse;

@RestController
@RequestMapping("api/")
public class Assessment1Controller {

	@GetMapping("testExceptionHandling")
	ResponseEntity<Object> getExceptionHandling(@RequestParam Integer code) {
		String message;
		ErrorResponse error;
		
		switch(code) {
		case 401:
			message = "You are not authorized";
			break;
		case 404:
			message = "resource not found";
			break;
		default:
			message = "Not supported";
			code = HttpStatus.CONFLICT.value();
			break;
		}
		
		error = new ErrorResponse(message);
		
		return new ResponseEntity<>(error, HttpStatus.valueOf(code));
	}
}
