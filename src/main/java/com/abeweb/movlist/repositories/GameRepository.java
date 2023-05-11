package com.abeweb.movlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeweb.movlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
