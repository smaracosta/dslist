package com.samara.dslist.repositories;

import com.samara.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// O Repository é o obejeto responsável por fazer consulta ao Banco de Dados.
public interface GameRepository extends JpaRepository<Game, Long> {
}
