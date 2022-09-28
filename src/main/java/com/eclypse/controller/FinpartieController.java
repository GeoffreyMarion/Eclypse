package com.eclypse.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eclypse.model.Joueur;
import com.eclypse.model.Partie;
import com.eclypse.repository.ScorespartieRepository;

@Controller
public class FinpartieController {
	
	@Autowired
	private ScorespartieRepository scorespartieRepository;
	
	@GetMapping("/finpartie")
	public String getfindepartie(Model model,HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		ArrayList <Joueur> joueurs= new ArrayList <Joueur>();
		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
		joueurs.add(joueur1);
		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
		joueurs.add(joueur2);
		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
		joueurs.add(joueur3);
		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
		joueurs.add(joueur4);
		Partie partie= (Partie) session.getAttribute("partie");
		ArrayList <Integer> scores=partie.getScorepartie().calculscore(joueurs);
		partie.getScorepartie().setScores(scores);
		
		int scoremax=0;
		int index=-1;
		int gagnant=0;
		for (int score : scores) {
			index++;
			if(score>scoremax){
				scoremax=score;
				gagnant=index;
			}
		}
		Joueur jgagnant= joueurs.get(gagnant);
		model.addAttribute("jgagnant",jgagnant);
		model.addAttribute("joueurs",joueurs);
		model.addAttribute("partie",partie);
		model.addAttribute("joueur1",joueur1);
		model.addAttribute("joueur2",joueur2);
		model.addAttribute("joueur3",joueur3);
		model.addAttribute("joueur4",joueur4);
		
		scorespartieRepository.save(partie.getScorepartie());
		
		return "finpartie";
	}
}
