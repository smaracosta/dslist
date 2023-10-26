package com.samara.dslist.repositories;

import com.samara.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// O6
public interface GameRepository extends JpaRepository<Game, Long> {
}
