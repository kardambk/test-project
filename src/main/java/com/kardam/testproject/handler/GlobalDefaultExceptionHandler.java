package com.kardam.testproject.handler;

import com.kardam.testproject.dto.Error;
import com.kardam.testproject.exception.CustomException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
class GlobalDefaultExceptionHandler {

    @ExceptionHandler({ CustomException.class })
    @ResponseBody
    public ResponseEntity<Error> handleRestException(CustomException ex, WebRequest request) {
        Error error = new Error().code(ex.getStatus().value()).message(ex.getMessage());
        return new ResponseEntity<Error>(error, new HttpHeaders(), ex.getStatus());
    }

    @ExceptionHandler({ Exception.class })
    @ResponseBody
    public ResponseEntity<Error> handleException(Exception ex, WebRequest request) {
        Error error = new Error().code(500).message(ex.getMessage());
        return new ResponseEntity<Error>(error, new HttpHeaders(), 500);
    }
}