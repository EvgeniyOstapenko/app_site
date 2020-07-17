package com.example.app_site.exception;

public class MyCustomException extends RuntimeException{

    public MyCustomException(String message){
        super(message);
    }
}
