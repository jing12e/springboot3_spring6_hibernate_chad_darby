package com.luv2code.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    // add exception handling code here
    // add an exception handler using @ExceptionHandler
    @ExceptionHandler
    //StudentErrorResponse-type of response body
    //StudentNotFoundException-exception type to handle/catch
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        //create a StudentErrorResponse Object
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());//404
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());


        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }


    //add another exception handler ... to catch any exception (catch all)
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception e) {
        //create a StudentErrorResponse Object
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value()); //400
        error.setMessage("bad request");
        error.setTimeStamp(System.currentTimeMillis());


        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}
