package com.eclypse.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Carte {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_carte;
	
	@NonNull
	private String nom;
	
	@NonNull
	private Caste caste;
	
	@NonNull
	private Couleur couleur;
	
	@NonNull
	private int valeur;
	
	@NonNull
	private String texte;
	
	@NonNull
	private Cible cible;
	
	@NonNull
	private ArrayList <Tag> tags;
	
	private int valeur_effet;
	
	@NonNull
	private String image;

	public Long getId_carte() {
		return id_carte;
	}

	public void setId_carte(Long id_carte) {
		this.id_carte = id_carte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Caste getCaste() {
		return caste;
	}

	public void setCaste(Caste caste) {
		this.caste = caste;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}

	public int getValeur_effet() {
		return valeur_effet;
	}

	public void setValeur_effet(int valeur_effet) {
		this.valeur_effet = valeur_effet;
	}

	public Cible getCible() {
		return cible;
	}

	public void setCible(Cible cible) {
		this.cible = cible;
	}
	
	
}
