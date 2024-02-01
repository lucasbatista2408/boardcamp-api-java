package com.boardcamp.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardcamp.api.model.boardGame.BoardGame;
import com.boardcamp.api.model.boardGame.BoardGameDTO;
import com.boardcamp.api.service.BoardGameService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/games")
public class BoardGameController {

    final BoardGameService boardGameService;

    BoardGameController(BoardGameService boardGameService){
        this.boardGameService = boardGameService;
    }

    @PostMapping
    public ResponseEntity<BoardGame> insertGame(@RequestBody @Valid BoardGameDTO data) {
        
        BoardGame response = boardGameService.insertGame(data);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<BoardGame>> getMethodName() {

        List<BoardGame> response = boardGameService.getAllGames();

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    
    
    
}
