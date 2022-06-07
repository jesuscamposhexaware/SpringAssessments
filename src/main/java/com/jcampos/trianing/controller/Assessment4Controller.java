package com.jcampos.trianing.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcampos.trianing.dto.ResponseDTO;
import com.jcampos.trianing.dto.User;

@RestController
@RequestMapping("api4/")
public class Assessment4Controller {

	@PostMapping("validInput")
	ResponseEntity<Object> getTestValidInput(@Valid @RequestBody User user) {
		ResponseDTO response = new ResponseDTO();
		response.setStatus("VALID");
		response.setErrors(new ArrayList<String>());
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
