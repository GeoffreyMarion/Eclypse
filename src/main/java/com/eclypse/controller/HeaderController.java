package com.eclypse.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eclypse.model.Carte;
import com.eclypse.model.Scorespartie;
import com.eclypse.repository.CarteRepository;
import com.eclypse.repository.ScorespartieRepository;


@Controller
public class HeaderController {
	
	@Autowired
	private CarteRepository carteRepository;
	
	@Autowired
	private ScorespartieRepository scorespartieRepository;
	
	@GetMapping("/cartes")
	public String getcartes(Model model) {
		ArrayList <Carte> cartes=(ArrayList<Carte>) carteRepository.findAll();
		model.addAttribute("cartes",cartes);
		return "cartes";
	}
	
	@GetMapping("/index")
	public String getindex(Model model) {
		return "index";
	}
	
	@GetMapping("/regles")
	public String getregles(Model model) {
		return "regles";
	}
	
	@GetMapping("/scores")
	public String getscores(Model model) {
		ArrayList <Scorespartie> scoresparties= (ArrayList<Scorespartie>) scorespartieRepository.findAll();
		model.addAttribute("scoresparties",scoresparties);
		return "scores";
	}
	
}

//récup les Scores en instance
// Scorespartie scorespartie = new Scorespartie();
//scoresparties= scorespartie.creerscores();

//création des cartes en base
//		for (Scorespartie scorespartie : scoresparties) {
//			scorespartieRepository.save(scorespartie);
//		}