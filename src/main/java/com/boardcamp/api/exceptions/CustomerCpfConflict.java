package com.boardcamp.api.exceptions;

public class CustomerCpfConflict extends RuntimeException{

    public CustomerCpfConflict(String message){
        super(message);
    }
    
}
