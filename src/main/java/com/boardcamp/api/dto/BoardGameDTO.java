package com.boardcamp.api.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BoardGameDTO {

    @NotBlank(message = "the field must not be blank @name/boardgame")
    private String name;

    @NotBlank(message = "field must not be blank @image/boardgame")
    @URL
    private String image;

    @Min(value = 1)
    @NotNull
    private Integer stockTotal;

    @Min(value = 1)
    @NotNull
    private Integer pricePerDay;
    
}
