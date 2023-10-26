package com.samara.dslist.services;

import com.samara.dslist.dto.GameDto;
import com.samara.dslist.dto.GameMinDto;
import com.samara.dslist.entities.Game;
import com.samara.dslist.projections.GameMinProjection;
import com.samara.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // @Service = indica ao Spring que essa classe se trata de um serviço
public class GameService {

    @Autowired // Resolve a dependência
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();

        return dto;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();

        return dto;
    }


}
