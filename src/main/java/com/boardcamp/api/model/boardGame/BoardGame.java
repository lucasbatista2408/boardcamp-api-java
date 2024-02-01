package com.boardcamp.api.model.boardGame;

import com.boardcamp.api.dto.BoardGameDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table
public class BoardGame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;

    @Column
    private String image;
    
    @Column
    private Integer stockTotal;
    
    @Column
    private Integer pricePerDay;

    public BoardGame(BoardGameDTO bg){
        this.name = bg.getName();
        this.image = bg.getImage();
        this.pricePerDay = bg.getPricePerDay();
        this.stockTotal = bg.getStockTotal();
    }
}
