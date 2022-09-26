package com.eclypse.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eclypse.model.Carte;
import com.eclypse.model.Partie;
import com.eclypse.repository.CarteRepository;
import com.eclypse.repository.PartieRepository;


@Controller
public class HeaderController {
	
	@Autowired
	private CarteRepository carteRepository;
	
	@Autowired
	private PartieRepository partieRepository;
	
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
		//ArrayList <Partie> parties= (ArrayList<Partie>) partieRepository.findAll();
		//model.addAttribute("parties",parties);
		return "scores";
	}
	
}

