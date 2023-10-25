package com.samara.dslist.services;

import com.samara.dslist.dto.GameMinDto;
import com.samara.dslist.entities.Game;
import com.samara.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired // Resolve a dependência
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();

        return dto;
    }
}
