package com.eclypse.controller;

import java.util.ArrayList;

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


@Controller
public class EchangeController {
	
//	@GetMapping("/echange12")
//	public String getechange12(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		return "echange12";
//	}
//	
//	@PostMapping("/echange12")public String postechange12(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		ArrayList <Carte> echangeJ1 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ1.add(joueur1.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ1.add(joueur1.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ1.add(joueur1.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ1.add(joueur1.getMain().get(3));}
//		model.addAttribute("echangeJ1",echangeJ1);
//		session.setAttribute("echangeJ1", echangeJ1);
//		return "redirect:/echange21";
//	}
//	
//	@GetMapping("/echange21")
//	public String getechange21(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		return "echange21";
//	}
//	
//	@PostMapping("/echange21")public String postechange21(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		ArrayList <Carte> echangeJ2 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ2.add(joueur2.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ2.add(joueur2.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ2.add(joueur2.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ2.add(joueur2.getMain().get(3));}
//		ArrayList <Carte> echangeJ1 = (ArrayList<Carte>) session.getAttribute("echangeJ1");
//		Partie partie= (Partie) session.getAttribute("partie");
//		partie.echange(joueur1, joueur2, echangeJ1, echangeJ2);
//		session.setAttribute("joueur1", joueur1);
//		session.setAttribute("joueur2", joueur2);
//		
//		return "redirect:/echange23";
//	}
//	
//	@GetMapping("/echange23")
//	public String getechange23(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		session.setAttribute("patie", partie);
//
//		return "echange23";
//	}
//	
//	@PostMapping("/echange23")public String postechange23(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		ArrayList <Carte> echangeJ2 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ2.add(joueur2.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ2.add(joueur2.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ2.add(joueur2.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ2.add(joueur2.getMain().get(3));}
//		model.addAttribute("echangeJ2",echangeJ2);
//		session.setAttribute("echangeJ2", echangeJ2);
//		return "redirect:/echange32";
//	}
//	
//	@GetMapping("/echange32")
//	public String getechange32(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		session.setAttribute("patie", partie);
//
//		return "echange32";
//	}
//	
//	@PostMapping("/echange32")public String postechange32(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur2=(Joueur) session.getAttribute("joueur2");
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		ArrayList <Carte> echangeJ3 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ3.add(joueur3.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ3.add(joueur3.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ3.add(joueur3.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ3.add(joueur3.getMain().get(3));}
//		ArrayList <Carte> echangeJ2 = (ArrayList<Carte>) session.getAttribute("echangeJ2");
//		Partie partie= (Partie) session.getAttribute("partie");
//		partie.echange(joueur2, joueur3, echangeJ2, echangeJ3);
//		session.setAttribute("joueur2", joueur2);
//		session.setAttribute("joueur3", joueur3);
//		session.setAttribute("patie", partie);
//		
//		return "redirect:/echange34";
//	}
//	
//	@GetMapping("/echange34")
//	public String getechange34(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		return "echange34";
//	}
//	
//	@PostMapping("/echange34")public String postechange34(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		ArrayList <Carte> echangeJ3 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ3.add(joueur3.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ3.add(joueur3.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ3.add(joueur3.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ3.add(joueur3.getMain().get(3));}
//		model.addAttribute("echangeJ3",echangeJ3);
//		session.setAttribute("echangeJ3", echangeJ3);
//		return "redirect:/echange43";
//	}
//	
//	@GetMapping("/echange43")
//	public String getechange43(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		session.setAttribute("patie", partie);
//
//		return "echange43";
//	}
//	
//	@PostMapping("/echange43")public String postechange43(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur3=(Joueur) session.getAttribute("joueur3");
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		ArrayList <Carte> echangeJ4 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ4.add(joueur4.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ4.add(joueur4.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ4.add(joueur4.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ4.add(joueur4.getMain().get(3));}
//		ArrayList <Carte> echangeJ3 = (ArrayList<Carte>) session.getAttribute("echangeJ3");
//		Partie partie= (Partie) session.getAttribute("partie");
//		partie.echange(joueur3, joueur4, echangeJ3, echangeJ4);
//		session.setAttribute("joueur3", joueur3);
//		session.setAttribute("joueur4", joueur4);
//		
//		return "redirect:/echange41";
//	}
//	
//	@GetMapping("/echange41")
//	public String getechange41(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		return "echange41";
//	}
//	
//	@PostMapping("/echange41")public String postechange41(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		ArrayList <Carte> echangeJ4 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ4.add(joueur4.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ4.add(joueur4.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ4.add(joueur4.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ4.add(joueur4.getMain().get(3));}
//		model.addAttribute("echangeJ4",echangeJ4);
//		session.setAttribute("echangeJ4", echangeJ4);
//		return "redirect:/echange14";
//	}
//	
//	@GetMapping("/echange14")
//	public String getechange14(Model model,HttpServletRequest request,HttpServletResponse response) {
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
//		return "echange14";
//	}
//	
//	@PostMapping("/echange14")public String postechange14(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
//		HttpSession session = request.getSession();
//		Joueur joueur1=(Joueur) session.getAttribute("joueur1");
//		Joueur joueur4=(Joueur) session.getAttribute("joueur4");
//		ArrayList <Carte> echangeJ1 = new ArrayList <Carte>();
//		if(cartes.contains("0")) {echangeJ1.add(joueur1.getMain().get(0));}
//		if(cartes.contains("1")) {echangeJ1.add(joueur1.getMain().get(1));}
//		if(cartes.contains("2")) {echangeJ1.add(joueur1.getMain().get(2));}
//		if(cartes.contains("3")) {echangeJ1.add(joueur1.getMain().get(3));}
//		ArrayList <Carte> echangeJ4 = (ArrayList<Carte>) session.getAttribute("echangeJ4");
//		Partie partie= (Partie) session.getAttribute("partie");
//		partie.echange(joueur4, joueur1, echangeJ4, echangeJ1);
//		session.setAttribute("joueur4", joueur4);
//		session.setAttribute("joueur1", joueur1);
//		
//		return "redirect:/pose1";
//	}
	
	@GetMapping("/echange")
	public String getechange(Model model,HttpServletRequest request,HttpServletResponse response) {
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

		return "echange";
	}
	
	@PostMapping("/echange")public String postechange(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "carte") String cartes) {
		HttpSession session = request.getSession();
		Partie partie = (Partie) session.getAttribute("partie");
		Joueur joueurinit= null;
		Joueur joueurrec= null;
		switch (partie.getPhase()) {
		case E12:
			joueurinit=(Joueur) session.getAttribute("joueur1");
			break;

		case E21:
			joueurinit=(Joueur) session.getAttribute("joueur1");
			joueurrec=(Joueur) session.getAttribute("joueur2");
			break;
			
		case E23:
			joueurinit=(Joueur) session.getAttribute("joueur2");
			break;
			
		case E32:
			joueurinit=(Joueur) session.getAttribute("joueur2");
			joueurrec=(Joueur) session.getAttribute("joueur3");
			break;
			
		case E34:
			joueurinit=(Joueur) session.getAttribute("joueur3");
			break;
			
		case E43:
			joueurinit=(Joueur) session.getAttribute("joueur3");
			joueurrec=(Joueur) session.getAttribute("joueur4");
			break;
			
		case E41:
			joueurinit=(Joueur) session.getAttribute("joueur4");
			break;
			
		case E14:
			joueurinit=(Joueur) session.getAttribute("joueur4");
			joueurrec=(Joueur) session.getAttribute("joueur1");
			break;
		}
		
		ArrayList <Carte> echangeJinit = new ArrayList <Carte>();
		ArrayList <Carte> echangeJrec = new ArrayList <Carte>();
		
		if (joueurrec == null) {
			if (cartes.contains("0")) {
				echangeJinit.add(joueurinit.getMain().get(0));
			}
			if (cartes.contains("1")) {
				echangeJinit.add(joueurinit.getMain().get(1));
			}
			if (cartes.contains("2")) {
				echangeJinit.add(joueurinit.getMain().get(2));
			}
			if (cartes.contains("3")) {
				echangeJinit.add(joueurinit.getMain().get(3));
			}
			model.addAttribute("echangeJinit",echangeJinit);
			session.setAttribute("echangeJinit", echangeJinit);
			
			switch (partie.getPhase()) {
			case E12:
				partie.setPhase(Phase.E21);
				break;

			case E23:
				partie.setPhase(Phase.E32);
				break;
				
			case E34:
				partie.setPhase(Phase.E43);
				break;
				
			case E41:
				partie.setPhase(Phase.E14);
				break;
			}
			
		}
		else {
			if (cartes.contains("0")) {
				echangeJrec.add(joueurrec.getMain().get(0));
			}
			if (cartes.contains("1")) {
				echangeJrec.add(joueurrec.getMain().get(1));
			}
			if (cartes.contains("2")) {
				echangeJrec.add(joueurrec.getMain().get(2));
			}
			if (cartes.contains("3")) {
				echangeJrec.add(joueurrec.getMain().get(3));
			}
			echangeJinit = (ArrayList<Carte>) session.getAttribute("echangeJinit");
			partie.echange(joueurinit, joueurrec, echangeJinit, echangeJrec);
			
			switch (partie.getPhase()) {
			case E21:
				session.setAttribute("joueur1", joueurinit);
				session.setAttribute("joueur2", joueurrec);
				partie.setPhase(Phase.E23);
				break;

			case E32:
				session.setAttribute("joueur2", joueurinit);
				session.setAttribute("joueur3", joueurrec);
				partie.setPhase(Phase.E34);
				break;
				
			case E43:
				session.setAttribute("joueur3", joueurinit);
				session.setAttribute("joueur4", joueurrec);
				partie.setPhase(Phase.E41);
				break;
				
			case E14:
				session.setAttribute("joueur4", joueurinit);
				session.setAttribute("joueur1", joueurrec);
				partie.setPhase(Phase.P1);
				session.setAttribute("partie",partie);
				
				return "redirect:/pose";
			}
		}
		model.addAttribute("partie",partie);
		session.setAttribute("partie",partie);
		return "redirect:/echange";
	}
	
}
