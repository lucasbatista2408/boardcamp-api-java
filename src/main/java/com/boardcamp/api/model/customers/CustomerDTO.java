package com.boardcamp.api.model.customers;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDTO {

    @NotBlank(message = "must not be null, empty or contain just a white space @costumer-name")
    private String name;

    @NotBlank(message = "must not be null, empty or contain just a white space @costumer-cpf")
    @Size(min = 11, max = 11)
    @CPF
    private String cpf;
    
}
