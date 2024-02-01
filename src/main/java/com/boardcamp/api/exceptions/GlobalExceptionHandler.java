package com.boardcamp.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    //User
    @ExceptionHandler
    public ResponseEntity<Object> handleGameNameConflict(GameNameConflict exception){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

}
