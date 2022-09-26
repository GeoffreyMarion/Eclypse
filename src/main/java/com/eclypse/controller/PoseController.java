package com.eclypse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eclypse.model.Carte;
import com.eclypse.model.Joueur;
import com.eclypse.model.Partie;
import com.eclypse.model.Phase;
import com.eclypse.model.Tour;

@Controller
public class PoseController {
	
//	@GetMapping("/pose1")
//	public String getpose1(Model model,HttpServletRequest request,HttpServletResponse response) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		model.addAttribute("joueur1",joueur1);
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		model.addAttribute("joueur2",joueur2);
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		model.addAttribute("joueur3",joueur3);
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		model.addAttribute("joueur4",joueur4);
//		Partie partie= (Partie) session.getAttribute("partie");
//		model.addAttribute("partie",partie);
//
//		return "pose1";
//	}
//	
//	@PostMapping("/pose1")public String postpose1(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String carte) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		Partie partie=(Partie) session.getAttribute("partie");
//		Carte cartepos = new Carte();
//		if(carte.contains("0")) {cartepos=(joueur1.getMain().get(0));}
//		if(carte.contains("1")) {cartepos=(joueur1.getMain().get(1));}
//		if(carte.contains("2")) {cartepos=(joueur1.getMain().get(2));}
//		if(carte.contains("3")) {cartepos=(joueur1.getMain().get(3));}
//		partie.pose(null, cartepos, joueur1, null, null);
//		model.addAttribute("joueur1",joueur1);
//		session.setAttribute("joueur1", joueur1);
//		return "redirect:/pose2";
//	}
//	
//	@GetMapping("/pose2")
//	public String getpose2(Model model,HttpServletRequest request,HttpServletResponse response) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		model.addAttribute("joueur1",joueur1);
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		model.addAttribute("joueur2",joueur2);
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		model.addAttribute("joueur3",joueur3);
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		model.addAttribute("joueur4",joueur4);
//		Partie partie= (Partie) session.getAttribute("partie");
//		model.addAttribute("partie",partie);
//
//		return "pose2";
//	}
//	
//	@PostMapping("/pose2")public String postpose2(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String carte) {
//		HttpSession session = request.getSession();
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		Partie partie=(Partie) session.getAttribute("partie");
//		Carte cartepos = new Carte();
//		if(carte.contains("0")) {cartepos=(joueur2.getMain().get(0));}
//		if(carte.contains("1")) {cartepos=(joueur2.getMain().get(1));}
//		if(carte.contains("2")) {cartepos=(joueur2.getMain().get(2));}
//		if(carte.contains("3")) {cartepos=(joueur2.getMain().get(3));}
//		partie.pose(null, cartepos, joueur2, null, null);
//		model.addAttribute("joueur2",joueur2);
//		session.setAttribute("joueur2", joueur2);
//		return "redirect:/pose3";
//	}
//	
//	@GetMapping("/pose3")
//	public String getpose3(Model model,HttpServletRequest request,HttpServletResponse response) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		model.addAttribute("joueur1",joueur1);
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		model.addAttribute("joueur2",joueur2);
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		model.addAttribute("joueur3",joueur3);
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		model.addAttribute("joueur4",joueur4);
//		Partie partie= (Partie) session.getAttribute("partie");
//		model.addAttribute("partie",partie);
//
//		return "pose3";
//	}
//	
//	@PostMapping("/pose3")public String postpose3(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String carte) {
//		HttpSession session = request.getSession();
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		Partie partie=(Partie) session.getAttribute("partie");
//		Carte cartepos = new Carte();
//		if(carte.contains("0")) {cartepos=(joueur3.getMain().get(0));}
//		if(carte.contains("1")) {cartepos=(joueur3.getMain().get(1));}
//		if(carte.contains("2")) {cartepos=(joueur3.getMain().get(2));}
//		if(carte.contains("3")) {cartepos=(joueur3.getMain().get(3));}
//		partie.pose(null, cartepos, joueur3, null, null);
//		model.addAttribute("joueur3",joueur3);
//		session.setAttribute("joueur3", joueur3);
//		return "redirect:/pose4";
//	}
//	
//	@GetMapping("/pose4")
//	public String getpose4(Model model,HttpServletRequest request,HttpServletResponse response) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		model.addAttribute("joueur1",joueur1);
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		model.addAttribute("joueur2",joueur2);
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		model.addAttribute("joueur3",joueur3);
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		model.addAttribute("joueur4",joueur4);
//		Partie partie= (Partie) session.getAttribute("partie");
//		model.addAttribute("partie",partie);
//
//		return "pose4";
//	}
//	
//	@PostMapping("/pose4")public String postpose4(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String carte) {
//		HttpSession session = request.getSession();
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		Partie partie=(Partie) session.getAttribute("partie");
//		Carte cartepos = new Carte();
//		if(carte.contains("0")) {cartepos=(joueur4.getMain().get(0));}
//		if(carte.contains("1")) {cartepos=(joueur4.getMain().get(1));}
//		if(carte.contains("2")) {cartepos=(joueur4.getMain().get(2));}
//		if(carte.contains("3")) {cartepos=(joueur4.getMain().get(3));}
//		partie.pose(null, cartepos, joueur4, null, null);
//		model.addAttribute("joueur4",joueur4);
//		session.setAttribute("joueur4", joueur4);
//		Tour tour= partie.getTour();
//		switch (tour) {
//		case T1_4:
//			tour=(Tour.T2_4);
//			break;
//		case T2_4:
//			tour=(Tour.T3_4);
//			break;
//		case T3_4:
//			tour=(Tour.T4_4);
//			break;
//		case T4_4:
//			return "redirect:/finpartie";
//		}
//		if(partie.getTour().equals(Tour.T3_4)) {
//			partie.setTour(tour);
//			session.setAttribute("partie", partie);
//		return "redirect:/pose1";
//		}
//		else {
//			partie.setTour(tour);
//			session.setAttribute("partie", partie);
//			return "redirect:/echange12";
//		}
//	}
	
	@GetMapping("/pose")
	public String getpose(Model model,HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
		model.addAttribute("joueur1",joueur1);
		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
		model.addAttribute("joueur2",joueur2);
		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
		model.addAttribute("joueur3",joueur3);
		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
		model.addAttribute("joueur4",joueur4);
		Partie partie= (Partie) session.getAttribute("partie");
		model.addAttribute("partie",partie);

		return "pose";
	}
	
	@PostMapping("/pose")public String postpose(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String carte) {
		HttpSession session = request.getSession();
		Partie partie=(Partie) session.getAttribute("partie");
		Joueur joueurpos= null;
		switch (partie.getPhase()) {
		case P1:
			joueurpos=(Joueur) session.getAttribute("joueur1");
			break;

		case P2:
			joueurpos=(Joueur) session.getAttribute("joueur2");
			break;
			
		case P3:
			joueurpos=(Joueur) session.getAttribute("joueur3");
			break;
			
		case P4:
			joueurpos=(Joueur) session.getAttribute("joueur4");
			break;

		}
		
		Carte cartepos = new Carte();
		if(carte.contains("0")) {cartepos=(joueurpos.getMain().get(0));}
		if(carte.contains("1")) {cartepos=(joueurpos.getMain().get(1));}
		if(carte.contains("2")) {cartepos=(joueurpos.getMain().get(2));}
		if(carte.contains("3")) {cartepos=(joueurpos.getMain().get(3));}
		partie.pose(null, cartepos, joueurpos, null, null);
		
		switch (partie.getPhase()) {
		case P1:
			partie.setPhase(Phase.P2);
			model.addAttribute("joueur1",joueurpos);
			session.setAttribute("joueur1", joueurpos);
			break;

		case P2:
			partie.setPhase(Phase.P3);
			model.addAttribute("joueur2",joueurpos);
			session.setAttribute("joueur2", joueurpos);
			break;
			
		case P3:
			partie.setPhase(Phase.P4);
			model.addAttribute("joueur3",joueurpos);
			session.setAttribute("joueur3", joueurpos);
			break;
			
		case P4:
			model.addAttribute("joueur4",joueurpos);
			session.setAttribute("joueur4", joueurpos);
			
			switch (partie.getTour()) {
			case T1_4:
				partie.setTour(Tour.T2_4);
				break;
			case T2_4:
				partie.setTour(Tour.T3_4);
				break;
			case T3_4:
				partie.setTour(Tour.T4_4);
				model.addAttribute("partie",partie);
				session.setAttribute("partie",partie);
				partie.setPhase(Phase.P1);
				return "redirect:/pose";
			case T4_4:
				return "redirect:/finpartie";
			}
			partie.setPhase(Phase.E12);
			model.addAttribute("partie",partie);
			session.setAttribute("partie",partie);
			return "redirect:/echange";
		}
		
		
		model.addAttribute("partie",partie);
		session.setAttribute("partie",partie);
		return "redirect:/pose";
		
	}
}
