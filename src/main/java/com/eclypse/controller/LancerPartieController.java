package com.eclypse.controller;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eclypse.model.Carte;
import com.eclypse.model.Caste;
import com.eclypse.model.Joueur;
import com.eclypse.model.Partie;
import com.eclypse.model.Phase;
import com.eclypse.model.Tour;
import com.eclypse.repository.CarteRepository;

@Controller
public class LancerPartieController {
	
	@Autowired
	private CarteRepository carteRepository;
	
	@GetMapping("/newpartie")
	public String index(Model model) {
		ArrayList <Caste> castes= new ArrayList <Caste>();
		castes.add(Caste.noble);
		castes.add(Caste.guildien);
		castes.add(Caste.pretre);
		model.addAttribute("castes", castes);
		return "newpartie";
	}
	
	@PostMapping("/newpartie")
	public String lancer(HttpServletRequest request,HttpServletResponse response, @RequestParam(value = "nomj1") String nomj1,
			@RequestParam(value = "nomj2") String nomj2, @RequestParam(value = "nomj3") String nomj3,
			@RequestParam(value = "nomj4") String nomj4, @RequestParam(value = "castej1") Caste castej1,
			@RequestParam(value = "castej2") Caste castej2, @RequestParam(value = "castej3") Caste castej3,
			@RequestParam(value = "castej4") Caste castej4, Model model) {
		HttpSession session = request.getSession(true);
		Partie partie = new Partie();
		ArrayList <String> nomsj= new ArrayList <String>();
		nomsj.add(nomj1);
		nomsj.add(nomj2);
		nomsj.add(nomj3);
		nomsj.add(nomj4);
		
		ArrayList <Caste> castesj= new ArrayList <Caste>();
		castesj.add(castej1);
		castesj.add(castej2);
		castesj.add(castej3);
		castesj.add(castej4);
		
		ArrayList <Carte> bibliotheque= new ArrayList <Carte>();
		bibliotheque = (ArrayList<Carte>) carteRepository.findAll();
		
		ArrayList <Joueur> joueurs=partie.lancerpartie(partie, nomsj, castesj, bibliotheque);
		partie.distribuer(partie);
		int num=0;
		for (Joueur joueur : joueurs) {
			num++;
			session.setAttribute("joueur"+num, joueur);
		}
		partie.setTour(Tour.T1_4);
		partie.setPhase(Phase.E12);
		
		session.setAttribute("partie", partie);
	    
		return "redirect:/echange";
	}
}


//récup des cartes en instance
//bibliotheque= carte.createbibliotheque();

//création des cartes en base
//		for (Carte carteb : bibliotheque) {
//			carteRepository.save(carteb);
//		}