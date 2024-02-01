package com.boardcamp.api.model.boardGame;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BoardGameDTO {

    @NotBlank(message = "the field must not be blank @name/boardgame")
    private String name;

    private String image;

    @Min(value = 1)
    @NotNull
    private Integer stockTotal;

    @Min(value = 1)
    @NotNull
    private Integer pricePerDay;
    
}
