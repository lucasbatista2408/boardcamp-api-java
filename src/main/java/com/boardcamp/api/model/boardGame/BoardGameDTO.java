package com.boardcamp.api.model.boardGame;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BoardGameDTO {

    @NotBlank(message = "the field must not be blank @name/boardgame")
    private String name;

    @NotBlank(message = "field must not be blank @image/boardgame")
    @URL
    private String image;

    @Min(value = 0)
    private Integer stockTotal;

    private Integer pricePerDay;
    
}
