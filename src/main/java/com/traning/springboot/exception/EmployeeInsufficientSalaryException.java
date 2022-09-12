package com.traning.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


import org.springframework.http.HttpStatus;
        import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeInsufficientSalaryException {
//}
public class EmployeeInsufficientSalaryException extends RuntimeException {

    public EmployeeInsufficientSalaryException(String exception) {
        super(exception);
    }

}