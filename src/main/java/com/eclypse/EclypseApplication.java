package com.eclypse;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eclypse.model.Carte;
import com.eclypse.model.Caste;
import com.eclypse.model.Joueur;
import com.eclypse.model.Partie;

@SpringBootApplication
public class EclypseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EclypseApplication.class, args);
//		ArrayList<String> noms = new ArrayList<String>(Arrays.asList("bob", "joe", "rob", "jack"));
//		ArrayList<Caste> castes = new ArrayList<Caste>(
//				Arrays.asList(Caste.guildien, Caste.guildien, Caste.pretre, Caste.noble));
//		Partie partie = new Partie();
//		Carte carte = new Carte();
//		ArrayList<Carte> bibliotheque = carte.createbibliotheque();
//		ArrayList<Joueur> joueurs = partie.lancerpartie(partie, noms, castes, bibliotheque);
//		System.out.println("Joueurs " + joueurs.size());
//		Joueur joueur1 = joueurs.get(0);
//		Joueur joueur2 = joueurs.get(1);
//		Joueur joueur3 = joueurs.get(2);
//		Joueur joueur4 = joueurs.get(3);
//		System.out.println("bibli " + bibliotheque.size());
//		partie.distribuer(partie);
//		System.out.println("distrubtion");
//		System.out.println("bibli " + bibliotheque.size());
//		System.out.println("__________________________");
//		ArrayList<Carte> mainj1 = (ArrayList<Carte>) joueur1.getMain().clone();
//		System.out.println("mainJ1 " + joueur1.getMain());
//		mainj1.remove(mainj1.size() - 1);
//		mainj1.remove(mainj1.size() - 1);
//		mainj1.remove(mainj1.size() - 1);
//		System.out.println("echJ1 " + mainj1);
//		ArrayList<Carte> mainj2 = (ArrayList<Carte>) joueur2.getMain().clone();
//		System.out.println("mainJ2 " + joueur2.getMain());
//		mainj2.remove(mainj2.size() - 1);
//		mainj2.remove(mainj2.size() - 1);
//		mainj2.remove(mainj2.size() - 1);
//		System.out.println("echJ2 " + mainj2);
//		partie.echange(joueur1, joueur2, mainj1, mainj2);
//		System.out.println("echange 1 2");
//		System.out.println("mainJ1 " + joueur1.getMain());
//		System.out.println("mainJ2 " + joueur2.getMain());
//		System.out.println("__________________________");
//		ArrayList<Carte> mainj2_ = (ArrayList<Carte>) joueur2.getMain().clone();
//		System.out.println("mainJ2 " + joueur2.getMain());
//		mainj2_.remove(mainj2_.size() - 1);
//		mainj2_.remove(mainj2_.size() - 1);
//		mainj2_.remove(mainj2_.size() - 1);
//		System.out.println("echJ2 " + mainj2_);
//		ArrayList<Carte> mainj3 = (ArrayList<Carte>) joueur3.getMain().clone();
//		System.out.println("mainJ3 " + joueur3.getMain());
//		mainj3.remove(mainj3.size() - 1);
//		mainj3.remove(mainj3.size() - 1);
//		mainj3.remove(mainj3.size() - 1);
//		System.out.println("echJ3 " + mainj3);
//		partie.echange(joueur2, joueur3, mainj2_, mainj3);
//		System.out.println("echange 2 3");
//		System.out.println("mainJ2 " + joueur2.getMain());
//		System.out.println("mainJ3 " + joueur3.getMain());
//		System.out.println("__________________________");
//		ArrayList<Carte> mainj3_ = (ArrayList<Carte>) joueur3.getMain().clone();
//		System.out.println("mainJ3 " + joueur3.getMain());
//		mainj3_.remove(mainj2_.size() - 1);
//		mainj3_.remove(mainj2_.size() - 1);
//		mainj3_.remove(mainj2_.size() - 1);
//		System.out.println("echJ3 " + mainj3_);
//		ArrayList<Carte> mainj4 = (ArrayList<Carte>) joueur4.getMain().clone();
//		System.out.println("mainJ4 " + joueur4.getMain());
//		mainj4.remove(mainj4.size() - 1);
//		mainj4.remove(mainj4.size() - 1);
//		mainj4.remove(mainj4.size() - 1);
//		System.out.println("echJ4 " + mainj4);
//		partie.echange(joueur3, joueur4, mainj3_, mainj4);
//		System.out.println("echange 3 4");
//		System.out.println("mainJ3 " + joueur3.getMain());
//		System.out.println("mainJ4 " + joueur4.getMain());
//		System.out.println("__________________________");
//		ArrayList<Carte> mainj4_ = (ArrayList<Carte>) joueur4.getMain().clone();
//		System.out.println("mainJ4 " + joueur4.getMain());
//		mainj4_.remove(mainj4_.size() - 1);
//		mainj4_.remove(mainj4_.size() - 1);
//		mainj4_.remove(mainj4_.size() - 1);
//		System.out.println("echJ4 " + mainj4_);
//		ArrayList<Carte> mainj1_ = (ArrayList<Carte>) joueur1.getMain().clone();
//		System.out.println("mainJ1 " + joueur1.getMain());
//		mainj1_.remove(mainj1_.size() - 1);
//		mainj1_.remove(mainj1_.size() - 1);
//		mainj1_.remove(mainj1_.size() - 1);
//		System.out.println("echJ1 " + mainj1_);
//		partie.echange(joueur4, joueur1, mainj4_, mainj1_);
//		System.out.println("echange 4 1");
//		System.out.println("mainJ4 " + joueur4.getMain());
//		System.out.println("mainJ1 " + joueur1.getMain());
//		System.out.println("__________________________");
//		System.out.println("Pose J1");
//		Carte carteJ1 = joueur1.getMain().get(0);
//		partie.pose(joueurs, carteJ1, joueur1, joueur4, carteJ1);
//		System.out.println("mainJ1 " + joueur1.getMain());
//		System.out.println("tableJ1 " + joueur1.getTable());
//		System.out.println("scoreJ1 " + joueur1.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J2");
//		Carte carteJ2 = joueur2.getMain().get(0);
//		partie.pose(joueurs, carteJ2, joueur2, joueur4, carteJ2);
//		System.out.println("mainJ2 " + joueur2.getMain());
//		System.out.println("tableJ2 " + joueur2.getTable());
//		System.out.println("scoreJ2 " + joueur2.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J3");
//		Carte carteJ3 = joueur3.getMain().get(0);
//		partie.pose(joueurs, carteJ3, joueur3, joueur4, carteJ3);
//		System.out.println("mainJ3 " + joueur3.getMain());
//		System.out.println("tableJ3 " + joueur3.getTable());
//		System.out.println("scoreJ3 " + joueur3.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J4");
//		Carte carteJ4 = joueur4.getMain().get(0);
//		partie.pose(joueurs, carteJ4, joueur4, joueur4, carteJ4);
//		System.out.println("mainJ4 " + joueur4.getMain());
//		System.out.println("tableJ4 " + joueur4.getTable());
//		System.out.println("scoreJ4 " + joueur4.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J1");
//		Carte carteJ1_ = joueur1.getMain().get(0);
//		partie.pose(joueurs, carteJ1_, joueur1, joueur4, carteJ1);
//		System.out.println("mainJ1 " + joueur1.getMain());
//		System.out.println("tableJ1 " + joueur1.getTable());
//		System.out.println("scoreJ1 " + joueur1.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J2");
//		Carte carteJ2_ = joueur2.getMain().get(0);
//		partie.pose(joueurs, carteJ2_, joueur2, joueur4, carteJ2);
//		System.out.println("mainJ2 " + joueur2.getMain());
//		System.out.println("tableJ2 " + joueur2.getTable());
//		System.out.println("scoreJ2 " + joueur2.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J3");
//		Carte carteJ3_ = joueur3.getMain().get(0);
//		partie.pose(joueurs, carteJ3_, joueur3, joueur4, carteJ3);
//		System.out.println("mainJ3 " + joueur3.getMain());
//		System.out.println("tableJ3 " + joueur3.getTable());
//		System.out.println("scoreJ3 " + joueur3.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J4");
//		Carte carteJ4_ = joueur4.getMain().get(0);
//		partie.pose(joueurs, carteJ4_, joueur4, joueur4, carteJ4);
//		System.out.println("mainJ4 " + joueur4.getMain());
//		System.out.println("tableJ4 " + joueur4.getTable());
//		System.out.println("scoreJ4 " + joueur4.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J1");
//		Carte carteJ1__ = joueur1.getMain().get(0);
//		partie.pose(joueurs, carteJ1__, joueur1, joueur4, carteJ1);
//		System.out.println("mainJ1 " + joueur1.getMain());
//		System.out.println("tableJ1 " + joueur1.getTable());
//		System.out.println("scoreJ1 " + joueur1.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J2");
//		Carte carteJ2__ = joueur2.getMain().get(0);
//		partie.pose(joueurs, carteJ2__, joueur2, joueur4, carteJ2);
//		System.out.println("mainJ2 " + joueur2.getMain());
//		System.out.println("tableJ2 " + joueur2.getTable());
//		System.out.println("scoreJ2 " + joueur2.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J3");
//		Carte carteJ3__ = joueur3.getMain().get(0);
//		partie.pose(joueurs, carteJ3__, joueur3, joueur4, carteJ3);
//		System.out.println("mainJ3 " + joueur3.getMain());
//		System.out.println("tableJ3 " + joueur3.getTable());
//		System.out.println("scoreJ3 " + joueur3.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J4");
//		Carte carteJ4__ = joueur4.getMain().get(0);
//		partie.pose(joueurs, carteJ4__, joueur4, joueur4, carteJ4);
//		System.out.println("mainJ4 " + joueur4.getMain());
//		System.out.println("tableJ4 " + joueur4.getTable());
//		System.out.println("scoreJ4 " + joueur4.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J1");
//		Carte carteJ1___ = joueur1.getMain().get(0);
//		partie.pose(joueurs, carteJ1___, joueur1, joueur4, carteJ1);
//		System.out.println("mainJ1 " + joueur1.getMain());
//		System.out.println("tableJ1 " + joueur1.getTable());
//		System.out.println("scoreJ1 " + joueur1.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J2");
//		Carte carteJ2___ = joueur2.getMain().get(0);
//		partie.pose(joueurs, carteJ2___, joueur2, joueur4, carteJ2);
//		System.out.println("mainJ2 " + joueur2.getMain());
//		System.out.println("tableJ2 " + joueur2.getTable());
//		System.out.println("scoreJ2 " + joueur2.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J3");
//		Carte carteJ3___ = joueur3.getMain().get(0);
//		partie.pose(joueurs, carteJ3___, joueur3, joueur4, carteJ3);
//		System.out.println("mainJ3 " + joueur3.getMain());
//		System.out.println("tableJ3 " + joueur3.getTable());
//		System.out.println("scoreJ3 " + joueur3.getScore().getValeur());
//		System.out.println("__________________________");
//		System.out.println("Pose J4");
//		Carte carteJ4___ = joueur4.getMain().get(0);
//		partie.pose(joueurs, carteJ4___, joueur4, joueur4, carteJ4);
//		System.out.println("mainJ4 " + joueur4.getMain());
//		System.out.println("tableJ4 " + joueur4.getTable());
//		System.out.println("scoreJ4 " + joueur4.getScore().getValeur());
//		System.out.println("__________________________");
//		partie.calculscore(joueurs);
//		System.out.println("Joueur1:[" + joueur1.getCaste() + ",val:" + joueur1.getScore().getValeur() + ",caste:"
//				+ joueur1.getScore().caste(joueur1) + ",couleur:" + joueur1.getScore().couleur(joueur1) + ",famille:"
//				+ joueur1.getScore().famille(joueur1) + ",suite:" + joueur1.getScore().suite(joueur1) + ",synergie:"
//				+ joueur1.getScore().synergie(joueur1) + "]");
//		System.out.println("Joueur2:[" + joueur2.getCaste() + ",val:" + joueur2.getScore().getValeur() + ",caste:"
//				+ joueur1.getScore().caste(joueur2) + ",couleur:" + joueur2.getScore().couleur(joueur2) + ",famille:"
//				+ joueur1.getScore().famille(joueur2) + ",suite:" + joueur2.getScore().suite(joueur2) + ",synergie:"
//				+ joueur1.getScore().synergie(joueur2) + "]");
//		System.out.println("Joueur3:[" + joueur3.getCaste() + ",val:" + joueur3.getScore().getValeur() + ",caste:"
//				+ joueur1.getScore().caste(joueur3) + ",couleur:" + joueur3.getScore().couleur(joueur3) + ",famille:"
//				+ joueur1.getScore().famille(joueur3) + ",suite:" + joueur3.getScore().suite(joueur3) + ",synergie:"
//				+ joueur1.getScore().synergie(joueur3) + "]");
//		System.out.println("Joueur4:[" + joueur4.getCaste() + ",val:" + joueur4.getScore().getValeur() + ",caste:"
//				+ joueur1.getScore().caste(joueur4) + ",couleur:" + joueur4.getScore().couleur(joueur4) + ",famille:"
//				+ joueur1.getScore().famille(joueur4) + ",suite:" + joueur4.getScore().suite(joueur4) + ",synergie:"
//				+ joueur1.getScore().synergie(joueur4) + "]");
//		System.out.println("Scores:" + partie.calculscore(joueurs));
	}

}
