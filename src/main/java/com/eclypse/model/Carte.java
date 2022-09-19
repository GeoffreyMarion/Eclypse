package com.eclypse.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import com.eclypse.repository.CarteRepository;

@Entity
public class Carte {
	
	//@Autowired
	//CarteRepository carteRepository;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_carte;
	
	//@NonNull
	private String nom;
	
	//@NonNull
	private Caste caste;
	
	//@NonNull
	private Couleur couleur;
	
	//@NonNull
	private int valeur;
	
	//@NonNull
	private String texte;
	
	//@NonNull
	private Cible cible;
	
	//@NonNull
	private ArrayList <Tag> tags;
	
	private int valeur_effet;
	
	//@NonNull
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
	
	public Carte(Long id_carte, String nom,Caste caste,Couleur couleur,int valeur,Cible cible,ArrayList <Tag> tags,int valeur_effet) {
		this.id_carte = id_carte;
		this.nom = nom;
		this.valeur= valeur;
		this.couleur= couleur;
		this.caste= caste;
		this.cible= cible;
		this.tags= tags;
		this.valeur_effet= valeur_effet;
	}
	
	public Carte() {
		
	}

	@Override
	public String toString() {
		return "["+ caste +" "+ nom +" "+ couleur +" "+ valeur +"]";	
	}

	//methode temporaire avant de récupérer en base
	public ArrayList <Carte> createbibliotheque(){
		ArrayList <Carte> bibliotheque = new ArrayList <Carte>();
		
		ArrayList <Tag> tagsC1 =new ArrayList <Tag>();
		tagsC1.add(Tag.autre);
		tagsC1.add(Tag.orange);
		Carte carte1 = new Carte((long) 3,"Hazat",Caste.noble,Couleur.orange,5,Cible.joueur,tagsC1,1);
		bibliotheque.add(carte1);
		
		ArrayList <Tag> tagsC2 =new ArrayList <Tag>();
		tagsC2.add(Tag.autre);
		tagsC2.add(Tag.rouge);
		Carte carte2 = new Carte((long) 4,"Hakwood",Caste.noble,Couleur.rouge,4,Cible.joueur,tagsC2,3);
		bibliotheque.add(carte2);
		
		ArrayList <Tag> tagsC3 =new ArrayList <Tag>();
		tagsC3.add(Tag.rouge);//couleur au choix du joueur, a gérer
		Carte carte3 = new Carte((long) 5,"Decados",Caste.noble,Couleur.vert,3,Cible.ennemis,tagsC3,2);
		bibliotheque.add(carte3);
		
		ArrayList <Tag> tagsC4 =new ArrayList <Tag>();
		tagsC4.add(Tag.pretre);
		Carte carte4 = new Carte((long) 6,"Li Halan",Caste.noble,Couleur.bleu,2,Cible.joueur,tagsC4,0);
		bibliotheque.add(carte4);
		
		ArrayList <Tag> tagsC5 =new ArrayList <Tag>();
		tagsC5.add(Tag.autre);
		tagsC5.add(Tag.jaune);
		Carte carte5 = new Carte((long) 7,"Al Malik",Caste.noble,Couleur.jaune,1,Cible.joueur,tagsC5,0);
		bibliotheque.add(carte5);
		
		ArrayList <Tag> tagsC6 =new ArrayList <Tag>();
		tagsC6.add(Tag.une);
		tagsC6.add(Tag.guildien);
		Carte carte6 = new Carte((long) 2,"Orthodoxe",Caste.pretre,Couleur.rouge,5,Cible.ennemis,tagsC6,3);
		bibliotheque.add(carte6);
		
		ArrayList <Tag> tagsC7 =new ArrayList <Tag>();
		tagsC7.add(Tag.eskatonique);
		Carte carte7 = new Carte((long) 8,"Eskatonique",Caste.pretre,Couleur.bleu,4,Cible.joueur,tagsC7,0);
		bibliotheque.add(carte7);
		
		ArrayList <Tag> tagsC8 =new ArrayList <Tag>();
		tagsC8.add(Tag.frere);
		Carte carte8 = new Carte((long) 9,"Frère d’arme",Caste.pretre,Couleur.orange,3,Cible.joueur,tagsC8,0);
		bibliotheque.add(carte8);
		
		ArrayList <Tag> tagsC9 =new ArrayList <Tag>();
		tagsC9.add(Tag.avesti);
		Carte carte9 = new Carte((long) 10,"Avesti",Caste.pretre,Couleur.vert,2,Cible.ennemi,tagsC9,0);
		bibliotheque.add(carte9);
		
		ArrayList <Tag> tagsC10 =new ArrayList <Tag>();
		tagsC10.add(Tag.couleur);
		Carte carte10 = new Carte((long) 11,"Amalthéen",Caste.pretre,Couleur.jaune,1,Cible.joueur,tagsC10,2);
		bibliotheque.add(carte10);
		
		ArrayList <Tag> tagsC11 =new ArrayList <Tag>();
		tagsC11.add(Tag.autre);
		tagsC11.add(Tag.guildien);
		Carte carte11 = new Carte((long) 12,"Bailli",Caste.guildien,Couleur.rouge,5,Cible.joueur,tagsC11,1);
		bibliotheque.add(carte11);
		
		ArrayList <Tag> tagsC12 =new ArrayList <Tag>();
		tagsC12.add(Tag.aurige);
		Carte carte12 = new Carte((long) 1,"Aurige",Caste.guildien,Couleur.bleu,4,Cible.joueur,tagsC12,0);
		bibliotheque.add(carte12);
		
		ArrayList <Tag> tagsC13 =new ArrayList <Tag>();
		tagsC13.add(Tag.noble);
		Carte carte13 = new Carte((long) 13,"Fouinard",Caste.guildien,Couleur.jaune,3,Cible.ennemis,tagsC13,2);
		bibliotheque.add(carte13);
		
		ArrayList <Tag> tagsC14 =new ArrayList <Tag>();
		//tagsC14.add(Tag.recruteur);
		tagsC14.add(Tag.noble);
		Carte carte14 = new Carte((long) 14,"Recruteur",Caste.guildien,Couleur.orange,2,Cible.ennemis,tagsC14,1);
		bibliotheque.add(carte14);
		
		ArrayList <Tag> tagsC15 =new ArrayList <Tag>();
		tagsC15.add(Tag.ingenieur);
		Carte carte15 = new Carte((long) 15,"Ingénieur",Caste.guildien,Couleur.vert,1,Cible.joueur,tagsC15,2);
		bibliotheque.add(carte15);
		
		ArrayList <Tag> tagsC16 =new ArrayList <Tag>();
		tagsC16.add(Tag.vao);
		Carte carte16 = new Carte((long) 16,"Vao",Caste.alien,Couleur.gris,7,Cible.joueur,tagsC16,0);
		bibliotheque.add(carte16);
		
		ArrayList <Tag> tagsC17 =new ArrayList <Tag>();
		tagsC17.add(Tag.obun);
		Carte carte17 = new Carte((long) 17,"Ukar",Caste.alien,Couleur.gris,3,Cible.joueur,tagsC17,0);
		bibliotheque.add(carte17);
		
		ArrayList <Tag> tagsC18 =new ArrayList <Tag>();
		tagsC18.add(Tag.ukar);
		Carte carte18 = new Carte((long) 18,"Obun",Caste.alien,Couleur.gris,2,Cible.ennemi,tagsC18,0);
		bibliotheque.add(carte18);
		
		return bibliotheque;
	}
}
