package com.boardcamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardcamp.api.model.customers.Customers;

public interface CustomerRepo extends JpaRepository<Customers, Long> {

    boolean existsByCpf(String cpf);
}
