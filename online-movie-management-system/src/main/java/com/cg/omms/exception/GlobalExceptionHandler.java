package com.cg.omms.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//Exception Handler class
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieException.class)
	public ResponseEntity<ErrorInfo> handleException(MovieException ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		 ResponseEntity<ErrorInfo> re = new ResponseEntity<ErrorInfo>(obj,HttpStatus.NOT_FOUND);
		 
		 return re;
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		 ResponseEntity<ErrorInfo> re = new ResponseEntity<ErrorInfo>(obj,HttpStatus.NOT_FOUND);

		 return re;
	}
		
}
