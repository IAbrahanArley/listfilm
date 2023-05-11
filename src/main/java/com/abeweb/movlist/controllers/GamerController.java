package com.abeweb.movlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abeweb.movlist.dto.GameMinDTO;
import com.abeweb.movlist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GamerController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO>  findAll(){
			List<GameMinDTO> result = gameService.findAll();
			return result;
	}
}