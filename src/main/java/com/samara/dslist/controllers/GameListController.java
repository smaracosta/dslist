package com.samara.dslist.controllers;

import com.samara.dslist.dto.GameDto;
import com.samara.dslist.dto.GameListDto;
import com.samara.dslist.dto.GameMinDto;
import com.samara.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//O controller serve para mapear o endereço
@RestController
@RequestMapping(value = "/lists")
public class GameListController { // "Porta de entrada" do Back-end, ele é quem disponibiliza a API. O Controlador que liga o Back e o front.

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

}
