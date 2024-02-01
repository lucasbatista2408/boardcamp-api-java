package com.boardcamp.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardcamp.api.model.customers.CustomerDTO;
import com.boardcamp.api.model.customers.Customers;
import com.boardcamp.api.service.CustomerService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/customers")
public class CustomerController {
    
    final CustomerService customerService;

    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Customers> insertCustomer(@RequestBody @Valid CustomerDTO dto) {

        Customers response = customerService.insertCustomer(new Customers(dto));
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
}
