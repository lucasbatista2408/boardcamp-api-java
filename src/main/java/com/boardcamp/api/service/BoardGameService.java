package com.boardcamp.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boardcamp.api.dto.BoardGameDTO;
import com.boardcamp.api.model.boardGame.BoardGame;
import com.boardcamp.api.repository.BoardGameRepo;

@Service
public class BoardGameService {

    final BoardGameRepo boardGameRepo;

     BoardGameService (BoardGameRepo boardGameRepo){
        this.boardGameRepo = boardGameRepo;
    }
    
    public BoardGame insertGame(BoardGameDTO data){
        return boardGameRepo.save(new BoardGame(data));
    }

    public List<BoardGame> getAllGames(){
        return boardGameRepo.findAll();
    }
}
