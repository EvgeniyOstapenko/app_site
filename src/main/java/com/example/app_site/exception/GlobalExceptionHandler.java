package com.example.app_site.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public String handleBaseException(Exception e){
        System.out.println("!!!!!!!!!!!");
        System.out.println(e.getMessage());
        System.out.println(e.fillInStackTrace());
        return e.getMessage();
    }
}
