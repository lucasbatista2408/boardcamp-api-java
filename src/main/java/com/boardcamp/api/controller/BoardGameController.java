package com.boardcamp.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boardcamp.api.dto.BoardGameDTO;
import com.boardcamp.api.model.boardGame.BoardGame;
import com.boardcamp.api.service.BoardGameService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/games")
public class BoardGameController {

    final BoardGameService boardGameService;

    BoardGameController(BoardGameService boardGameService){
        this.boardGameService = boardGameService;
    }

    @PostMapping
    public ResponseEntity<BoardGame> insertGame(@RequestBody BoardGameDTO data) {
        
        BoardGame response = boardGameService.insertGame(data);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<BoardGame>> getMethodName() {

        List<BoardGame> response = boardGameService.getAllGames();

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    
    
    
}
