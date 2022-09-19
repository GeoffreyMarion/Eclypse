package com.eclypse.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclypse.model.Carte;
import com.eclypse.repository.CarteRepository;

@Service
public class CarteService {

	@Autowired
	private CarteRepository carteRepository;
	
	public ArrayList <Carte> allcards(){
		ArrayList <Carte> cartes= (ArrayList<Carte>) carteRepository.findAll();
		return cartes;
	}
}
