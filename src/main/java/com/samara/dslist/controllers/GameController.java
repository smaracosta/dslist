package com.samara.dslist.controllers;

import com.samara.dslist.dto.GameDto;
import com.samara.dslist.dto.GameMinDto;
import com.samara.dslist.entities.Game;
import com.samara.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//O controller serve para mapear o endereço
@RestController
@RequestMapping(value = "/games")
public class GameController { // "Porta de entrada" do Back-end, ele é quem disponibiliza a API. O Controlador que liga o Back e o front.

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id) {
        GameDto result = gameService.findById(id);
        return result;
    }
}
