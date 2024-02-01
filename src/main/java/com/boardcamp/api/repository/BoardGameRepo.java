package com.boardcamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boardcamp.api.model.boardGame.BoardGame;

@Repository
public interface BoardGameRepo extends JpaRepository<BoardGame, Long> {
    
}
