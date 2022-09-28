package com.eclypse.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scorespartie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_scorespartie;
	
	//@NonNull
		private ArrayList <String> nomjoueurs;
		
	//@NonNull
	private ArrayList <Integer> scores;

	public Long getId_scorespartie() {
		return id_scorespartie;
	}

	public void setId_scorespartie(Long id_scorespartie) {
		this.id_scorespartie = id_scorespartie;
	}

	public ArrayList<String> getNomjoueurs() {
		return nomjoueurs;
	}

	public void setNomjoueurs(ArrayList<String> nomjoueurs) {
		this.nomjoueurs = nomjoueurs;
	}

	public ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}

	public Scorespartie(ArrayList<String> nomjoueurs, ArrayList<Integer> scores) {
		super();
		this.nomjoueurs = nomjoueurs;
		this.scores = scores;
	}
	

	public Scorespartie() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Scorespartie [id_scorespartie=" + id_scorespartie + ", nomjoueurs=" + nomjoueurs + ", scores=" + scores
				+ "]";
	}

	public void remplirscores(Partie partie,Scorespartie scorepartie) {
		ArrayList <String> noms= new ArrayList<String>();
		ArrayList <Joueur> joueurs=partie.getJoueurs();
		for (Joueur joueur : joueurs) {
			String nom= joueur.getNom();
			noms.add(nom);
		}
		scorepartie.setNomjoueurs(noms);
		
		ArrayList<Integer> scoresp = new ArrayList<Integer>();
		ArrayList <Score> scores=partie.getScore();
		for (Score score : scores) {
			int scorej= score.getValeur();
			scoresp.add(scorej);
		}
		scorepartie.setScores(scoresp);
	}
	
	public ArrayList <Scorespartie> creerscores(){
		ArrayList <Scorespartie> scorespartie = new ArrayList <Scorespartie>();
		
		Scorespartie score1= new Scorespartie();
		ArrayList <String> noms1= new ArrayList<String>();
		noms1.add("Bob");
		noms1.add("Joe");
		noms1.add("Jack");
		noms1.add("Mike");
		ArrayList <Integer> scores1= new ArrayList<Integer>();
		scores1.add(12);
		scores1.add(15);
		scores1.add(18);
		scores1.add(24);
		score1.setNomjoueurs(noms1);
		score1.setScores(scores1);
		scorespartie.add(score1);
		
		Scorespartie score2= new Scorespartie();
		ArrayList <String> noms2= new ArrayList<String>();
		noms2.add("Boby");
		noms2.add("Joey");
		noms2.add("Jacky");
		noms2.add("Mikey");
		ArrayList <Integer> scores2= new ArrayList<Integer>();
		scores2.add(22);
		scores2.add(12);
		scores2.add(20);
		scores2.add(13);
		score2.setNomjoueurs(noms2);
		score2.setScores(scores2);
		scorespartie.add(score2);
		
		Scorespartie score3= new Scorespartie();
		ArrayList <String> noms3= new ArrayList<String>();
		noms3.add("Moussy");
		noms3.add("Moussa");
		noms3.add("Moussu");
		noms3.add("Moussaka");
		ArrayList <Integer> scores3= new ArrayList<Integer>();
		scores3.add(11);
		scores3.add(17);
		scores3.add(12);
		scores3.add(24);
		score3.setNomjoueurs(noms3);
		score3.setScores(scores3);
		scorespartie.add(score3);
		
		return scorespartie;
	}
}
