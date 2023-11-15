package com.devstarrk.dslist.repositories;

import com.devstarrk.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
