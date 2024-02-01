package com.boardcamp.api.service;

import org.springframework.stereotype.Service;

import com.boardcamp.api.exceptions.CustomerCpfConflict;
import com.boardcamp.api.model.customers.Customers;
import com.boardcamp.api.repository.CustomerRepo;

@Service
public class CustomerService {
    
    final CustomerRepo customerRepo;

    CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    public Customers insertCustomer(Customers customers){

        if(customerRepo.existsByCpf(customers.getCpf())){
            throw new CustomerCpfConflict("user conflict, cpf already in use.");
        }

        return customerRepo.save(customers);
    }
}
