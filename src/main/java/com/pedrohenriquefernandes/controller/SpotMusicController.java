package com.pedrohenriquefernandes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrohenriquefernandes.model.SpotMusic;
import com.pedrohenriquefernandes.model.SpotMusicRepository;


@RestController
@RequestMapping("/api/spotmusic")
public class SpotMusicController {
	@Autowired
	SpotMusicRepository injecao;
	
	@GetMapping
	public List<SpotMusic> getTimes(){
		return injecao.findAll();
	}
	
	@PostMapping
	public SpotMusic addMusic(@RequestBody SpotMusic spotmusic) {
		return injecao.save(spotmusic);
	}
	
	@DeleteMapping("/{id}")
	public String removeMusic(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção realizada com sucesso";
	}
	
	@PutMapping
	public SpotMusic updateMusic(@RequestBody SpotMusic spotmusic) {
		return injecao.save(spotmusic);
	}
}
