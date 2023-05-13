package com.abeweb.movlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abeweb.movlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
