package com.eclypse.model;

import java.util.ArrayList;

public class Joueur {

	private int id_joueur;
	private String nom;
	private Score score;
	private Caste caste;
	private ArrayList<Carte> main;
	private ArrayList<Carte> table;
	
	public int getId_joueur() {
		return id_joueur;
	}
	public void setId_joueur(int id_joueur) {
		this.id_joueur = id_joueur;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public Caste getCaste() {
		return caste;
	}
	public void setCaste(Caste caste) {
		this.caste = caste;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList<Carte> getMain() {
		return main;
	}
	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}
	public ArrayList<Carte> getTable() {
		return table;
	}
	public void setTable(ArrayList<Carte> table) {
		this.table = table;
	}
	
	
	@Override
	public String toString() {
		return "Joueur [id_joueur=" + id_joueur + ", nom=" + nom + ", score=" + score + ", caste=" + caste + ", main="
				+ main + ", table=" + table + "]";
	}
	public Joueur(int id_joueur,String nom,Caste caste,Score score) {
		this.id_joueur = id_joueur;
		this.nom = nom;
		this.caste = caste;
		this.score = score;
	}
	public Joueur(int id_joueur, String nom, Score score, Caste caste, ArrayList<Carte> main, ArrayList<Carte> table) {
		this.id_joueur = id_joueur;
		this.nom = nom;
		this.score = score;
		this.caste = caste;
		this.main = main;
		this.table = table;
	}
	
	
	
}