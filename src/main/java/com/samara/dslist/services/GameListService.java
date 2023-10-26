package com.samara.dslist.services;

import com.samara.dslist.dto.GameListDto;
import com.samara.dslist.entities.Game;
import com.samara.dslist.entities.GameList;
import com.samara.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // @Service = indica ao Spring que essa classe se trata de um serviço
public class GameListService {

    @Autowired // Resolve a dependência
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }



}
