package com.abeweb.movlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abeweb.movlist.dto.GameListDTO;
import com.abeweb.movlist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GamerListController {
	
	@Autowired
	private GameListService gameListService;
	

	@GetMapping
	public List<GameListDTO>  findAll(){
			List<GameListDTO> result = gameListService.findAll();
			return result;
	}
}