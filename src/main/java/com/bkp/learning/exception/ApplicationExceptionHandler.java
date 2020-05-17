package com.bkp.learning.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	public ApplicationExceptionHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex){
		
		
		ExceptionDescription excDescription = new ExceptionDescription(ex.getMessage(),new Date()," Requested User was not found. Please try again using proper ID");
		return new ResponseEntity<Object>(excDescription,HttpStatus.NOT_FOUND);
	}
	
	

}
