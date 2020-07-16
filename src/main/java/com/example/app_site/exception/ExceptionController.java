package com.example.app_site.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController implements ErrorController {

    @Override
    @ResponseBody
    public String getErrorPath() {
        return "No Mapping Found";
    }
}
