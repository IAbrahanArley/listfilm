package com.abeweb.movlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abeweb.movlist.dto.GameListDTO;
import com.abeweb.movlist.entities.GameList;
import com.abeweb.movlist.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}

}
