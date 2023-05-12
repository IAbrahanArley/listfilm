package com.abeweb.movlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abeweb.movlist.dto.GameDTO;
import com.abeweb.movlist.dto.GameMinDTO;
import com.abeweb.movlist.entities.Game;
import com.abeweb.movlist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	//################Tratar exceçao depois ######################
	@org.springframework.transaction.annotation.Transactional (readOnly = true)
	public GameDTO findById(Long id) {
		var result = gameRepository.findById(id).get();
		var dto = new GameDTO(result);
		return dto;
	}
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}

}
