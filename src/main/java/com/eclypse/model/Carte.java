package com.eclypse.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import com.eclypse.repository.CarteRepository;

//import com.eclypse.repository.CarteRepository;

@Entity
public class Carte {
	
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
	
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Carte(String nom,Caste caste,Couleur couleur,int valeur,Cible cible,ArrayList <Tag> tags,int valeur_effet,String image) {
		this.nom = nom;
		this.caste= caste;
		this.couleur= couleur;
		this.valeur= valeur;
		this.cible= cible;
		this.tags= tags;
		this.valeur_effet= valeur_effet;
		this.image= image;
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
		Carte carte1 = new Carte("Hazat",Caste.noble,Couleur.orange,5,Cible.joueur,tagsC1,1,"/images/cartes/Hazat.jpg");
		bibliotheque.add(carte1);
		
		ArrayList <Tag> tagsC2 =new ArrayList <Tag>();
		tagsC2.add(Tag.autre);
		tagsC2.add(Tag.rouge);
		Carte carte2 = new Carte("Hakwood",Caste.noble,Couleur.rouge,4,Cible.joueur,tagsC2,3,"/images/cartes/Hakwood.jpg");
		bibliotheque.add(carte2);
		
		ArrayList <Tag> tagsC3 =new ArrayList <Tag>();
		tagsC3.add(Tag.rouge);//couleur au choix du joueur, a gérer
		Carte carte3 = new Carte("Decados",Caste.noble,Couleur.vert,3,Cible.ennemis,tagsC3,2,"/images/cartes/Decados.jpg");
		bibliotheque.add(carte3);
		
		ArrayList <Tag> tagsC4 =new ArrayList <Tag>();
		tagsC4.add(Tag.pretre);
		Carte carte4 = new Carte("Li Halan",Caste.noble,Couleur.bleu,2,Cible.joueur,tagsC4,0,"/images/cartes/LiHalan.jpg");
		bibliotheque.add(carte4);
		
		ArrayList <Tag> tagsC5 =new ArrayList <Tag>();
		tagsC5.add(Tag.autre);
		tagsC5.add(Tag.jaune);
		Carte carte5 = new Carte("Al Malik",Caste.noble,Couleur.jaune,1,Cible.joueur,tagsC5,0,"/images/cartes/AlMalik.jpg");
		bibliotheque.add(carte5);
		
		ArrayList <Tag> tagsC6 =new ArrayList <Tag>();
		tagsC6.add(Tag.une);
		tagsC6.add(Tag.guildien);
		Carte carte6 = new Carte("Orthodoxe",Caste.pretre,Couleur.rouge,5,Cible.ennemis,tagsC6,3,"/images/cartes/Orthodoxe.jpg");
		bibliotheque.add(carte6);
		
		ArrayList <Tag> tagsC7 =new ArrayList <Tag>();
		tagsC7.add(Tag.eskatonique);
		Carte carte7 = new Carte("Eskatonique",Caste.pretre,Couleur.bleu,4,Cible.joueur,tagsC7,0,"/images/cartes/Eskatonique.jpg");
		bibliotheque.add(carte7);
		
		ArrayList <Tag> tagsC8 =new ArrayList <Tag>();
		tagsC8.add(Tag.frere);
		Carte carte8 = new Carte("Frère d’arme",Caste.pretre,Couleur.orange,3,Cible.joueur,tagsC8,0,"/images/cartes/FrereDArme.jpg");
		bibliotheque.add(carte8);
		
		ArrayList <Tag> tagsC9 =new ArrayList <Tag>();
		tagsC9.add(Tag.avesti);
		Carte carte9 = new Carte("Avesti",Caste.pretre,Couleur.vert,2,Cible.ennemi,tagsC9,0,"/images/cartes/Avesti.jpg");
		bibliotheque.add(carte9);
		
		ArrayList <Tag> tagsC10 =new ArrayList <Tag>();
		tagsC10.add(Tag.couleur);
		Carte carte10 = new Carte("Amalthéen",Caste.pretre,Couleur.jaune,1,Cible.joueur,tagsC10,2,"/images/cartes/Amaltheen.jpg");
		bibliotheque.add(carte10);
		
		ArrayList <Tag> tagsC11 =new ArrayList <Tag>();
		tagsC11.add(Tag.autre);
		tagsC11.add(Tag.guildien);
		Carte carte11 = new Carte("Bailli",Caste.guildien,Couleur.rouge,5,Cible.joueur,tagsC11,1,"/images/cartes/Bailli.jpg");
		bibliotheque.add(carte11);
		
		ArrayList <Tag> tagsC12 =new ArrayList <Tag>();
		tagsC12.add(Tag.aurige);
		Carte carte12 = new Carte("Aurige",Caste.guildien,Couleur.bleu,4,Cible.joueur,tagsC12,0,"/images/cartes/Aurige.jpg");
		bibliotheque.add(carte12);
		
		ArrayList <Tag> tagsC13 =new ArrayList <Tag>();
		tagsC13.add(Tag.noble);
		Carte carte13 = new Carte("Fouinard",Caste.guildien,Couleur.jaune,3,Cible.ennemis,tagsC13,2,"/images/cartes/Fouinard.jpg");
		bibliotheque.add(carte13);
		
		ArrayList <Tag> tagsC14 =new ArrayList <Tag>();
		//tagsC14.add(Tag.recruteur);
		tagsC14.add(Tag.noble);
		Carte carte14 = new Carte("Recruteur",Caste.guildien,Couleur.orange,2,Cible.ennemis,tagsC14,1,"/images/cartes/Recruteur.jpg");
		bibliotheque.add(carte14);
		
		ArrayList <Tag> tagsC15 =new ArrayList <Tag>();
		tagsC15.add(Tag.ingenieur);
		Carte carte15 = new Carte("Ingénieur",Caste.guildien,Couleur.vert,1,Cible.joueur,tagsC15,2,"/images/cartes/Ingenieur.jpg");
		bibliotheque.add(carte15);
		
		ArrayList <Tag> tagsC16 =new ArrayList <Tag>();
		tagsC16.add(Tag.vao);
		Carte carte16 = new Carte("Vao",Caste.alien,Couleur.gris,7,Cible.joueur,tagsC16,0,"/images/cartes/Vao.jpg");
		bibliotheque.add(carte16);
		
		ArrayList <Tag> tagsC17 =new ArrayList <Tag>();
		tagsC17.add(Tag.obun);
		Carte carte17 = new Carte("Ukar",Caste.alien,Couleur.gris,3,Cible.joueur,tagsC17,0,"/images/cartes/Ukar.jpg");
		bibliotheque.add(carte17);
		
		ArrayList <Tag> tagsC18 =new ArrayList <Tag>();
		tagsC18.add(Tag.ukar);
		Carte carte18 = new Carte("Obun",Caste.alien,Couleur.gris,2,Cible.ennemi,tagsC18,0,"/images/cartes/Obun.jpg");
		bibliotheque.add(carte18);
		
		return bibliotheque;
	}
}