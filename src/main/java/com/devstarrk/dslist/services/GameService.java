package com.devstarrk.dslist.services;

import com.devstarrk.dslist.dto.GameMinDTO;
import com.devstarrk.dslist.entities.Game;
import com.devstarrk.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
