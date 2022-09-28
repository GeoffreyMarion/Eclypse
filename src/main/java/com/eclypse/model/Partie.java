package com.eclypse.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Partie {

	private Long id_partie;

	private ArrayList<Carte> bibliotheque;
	private ArrayList<Carte> cimetiere;
	
	private Scorespartie scorepartie;

	private Tour tour;
	private Phase phase;

	public Long getId_partie() {
		return id_partie;
	}

	public void setId_partie(Long id_partie) {
		this.id_partie = id_partie;
	}

	public ArrayList<Carte> getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliotheque(ArrayList<Carte> bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	public ArrayList<Carte> getCimetiere() {
		return cimetiere;
	}

	public void setCimetiere(ArrayList<Carte> cimetiere) {
		this.cimetiere = cimetiere;
	}

	public Scorespartie getScorepartie() {
		return scorepartie;
	}

	public void setScorepartie(Scorespartie scorepartie) {
		this.scorepartie = scorepartie;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

	public Partie() {

	}

	@Override
	public String toString() {
		return "Partie [id_partie=" + id_partie +", bibliotheque=" + bibliotheque
				+ ", cimetiere=" + cimetiere +", tour=" + tour + "]";
	}

//méthodes

	// methode ok a tester avec des cartes
	public ArrayList<Joueur> lancerpartie(Partie partie, ArrayList<String> noms, ArrayList<Caste> castes,
			ArrayList<Carte> bibliotheque) {
		int nbr_joueurs = castes.size();
		Scorespartie scorespartie = new Scorespartie();
		ArrayList <String> nomsj= new ArrayList <String>();
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		for (int i = 0; i < nbr_joueurs; ++i) {
			Score score = new Score(0);
			Joueur joueur = new Joueur(i, noms.get(i), score, castes.get(i), new ArrayList<Carte>(),
					new ArrayList<Carte>());
			joueurs.add(joueur);
			nomsj.add(noms.get(i));
		}
		scorespartie.setNomjoueurs(nomsj);
		partie.setScorepartie(scorespartie);
		partie.setBibliotheque(bibliotheque);
		return joueurs;
	}

	// methode ok
	public int randcarte(int taille) {
		int randcarte = ThreadLocalRandom.current().nextInt(1, taille);
		return randcarte;
	}

	public void distribuer(Partie partie,ArrayList<Joueur> joueurs) {
		ArrayList<Carte> bibliotheque = partie.getBibliotheque();
		int pioche = bibliotheque.size();
		ArrayList<String> njoueurs = partie.getScorepartie().getNomjoueurs();
		int nbre = 8 - njoueurs.size();
		for (Joueur joueur : joueurs) {
			for (int i = 1; i < nbre + 1; ++i) {
				Carte carte = bibliotheque.get(randcarte(pioche));
				joueur.getMain().add(carte);
				bibliotheque.remove(carte);
				pioche--;
			}
		}
	}

	// a faire en session mais marche
	public void echange(Joueur joueurinit, Joueur joueurrec, ArrayList<Carte> cartesJinit,
			ArrayList<Carte> cartesjrec) {
		for (Carte carte : cartesJinit) {
			ArrayList<Carte> mainrec = joueurrec.getMain();
			mainrec.add(carte);
			joueurrec.setMain(mainrec);
			joueurinit.getMain().remove(carte);
		}
		for (Carte carte : cartesjrec) {
			ArrayList<Carte> maininit = joueurinit.getMain();
			maininit.add(carte);
			joueurinit.setMain(maininit);
			joueurrec.getMain().remove(carte);
		}
	}

	public void pose(ArrayList<Joueur> joueurs, Carte carte, Joueur poseur, Joueur cible, Carte cartec) {
		poseur.getTable().add(carte);
		poseur.getMain().remove(carte);
		// Cible ciblec= carte.getCible();
		poseur.getScore().setValeur(poseur.getScore().getValeur() + carte.getValeur());
		// ArrayList <Joueur> joueursc=designercible(joueurs, ciblec, poseur, cible);
		// effet(carte,cartec,joueursc,ciblec);
	}

	public ArrayList<Joueur> designercible(ArrayList<Joueur> joueursp, Cible cible, Joueur joueur, Joueur joueurc) {

		ArrayList<Joueur> joueursc = new ArrayList<Joueur>();
		if (cible == Cible.joueur) {
			joueursc.add(joueur);
		} else if (cible == Cible.ennemi) {
			joueursc.add(joueurc);
		} else if (cible == Cible.ennemis) {
			joueursp.remove(joueur);
			joueursc = joueursp;
		}
		return joueursc;

	}

	public void effet(Carte cartep, Carte cartec, ArrayList<Joueur> joueursc, Cible cible) {
		ArrayList<Tag> tags = cartep.getTags();
		int valeureff = cartep.getValeur_effet();

		// Si la carte a une valeur d'effet (cad non tag particulier//
		if (valeureff != 0) {

			for (Joueur joueur : joueursc) {
				// Arraylist de cartes sur la table du joueur, leur couleur, leur castes.
				ArrayList<Carte> tablej = joueur.getTable();
				// si tag autre retire la carte du cartetablej
				tablej = testTagAutre(cartep, tags, tablej);
				// Fait un array de couleurs des cartes du joueur
				ArrayList<Couleur> couleurs = couleursTJoueur(tablej);
				// Fait un array de castes des cartes du joueur
				ArrayList<Caste> castes = castesTJoueur(tablej);

				int occurences = 0;

				// vérifie si il y a un Tag de "couleur"
				if (tags.contains(Tag.rouge) || tags.contains(Tag.vert) || tags.contains(Tag.bleu)
						|| tags.contains(Tag.orange) || tags.contains(Tag.jaune)) {
					Tag tcouleur = null;
					for (Tag tag : tags) {
						for (Couleur couleur : couleurs) {
							if (tag.equals(couleur)) {
								tcouleur = tag;
							}
						}
					}

					occurences = effetcouleur(tcouleur, couleurs);
					occurences = testTagune(occurences, tags);
				}

				// vérifie si il y a un Tag qui donne toutes les couleurs
				else if (tags.contains(Tag.couleur)) {
					for (Couleur couleur : Couleur.values()) {
						if (couleurs.contains(couleur)) {
							occurences++;
						}
					}
				}
				// vérifie si il y a un Tag "noble"
				else if (tags.contains(Tag.noble) || tags.contains(Tag.guildien) || tags.contains(Tag.pretre)) {
					Tag tcaste = null;
					for (Tag tag : tags) {
						for (Caste caste : castes) {
							if (tag.equals(caste)) {
								tcaste = tag;
							}
						}
					}
					occurences = effetcaste(tcaste, castes);
					occurences = testTagune(occurences, tags);
				}
				// vérifie la cible de l'effet pour l'appliquer
				if (cible == Cible.joueur) {
					joueur.getScore().setValeur((joueur.getScore().getValeur() + valeureff * occurences));
				} else {
					joueur.getScore().setValeur((joueur.getScore().getValeur() - valeureff * occurences));
				}

			}
		} else {
			// autres tags particuliers a tester
			// (obun,vao,ukar,aurige,avesti,frere,eskatonique)
		}
	}

	public ArrayList<Carte> mainJouC(Joueur joueur) {
		ArrayList<Carte> main = new ArrayList<Carte>();
		main = joueur.getTable();
		return main;
	}

	public ArrayList<Couleur> couleursTJoueur(ArrayList<Carte> tablej) {
		ArrayList<Couleur> couleurs = new ArrayList<Couleur>();

		for (Carte carte : tablej) {
			Couleur couleur = carte.getCouleur();
			couleurs.add(couleur);
		}
		return couleurs;
	}

	public ArrayList<Caste> castesTJoueur(ArrayList<Carte> tablej) {
		ArrayList<Caste> castes = new ArrayList<Caste>();

		for (Carte carte : tablej) {
			Caste caste = carte.getCaste();
			castes.add(caste);
		}
		return castes;
	}

	public int effetcouleur(Tag tagcouleur, ArrayList<Couleur> couleurs) {
		int occurrences = Collections.frequency(couleurs, tagcouleur);
		return occurrences;
	}

	public int effetcaste(Tag tagcaste, ArrayList<Caste> castes) {
		int occurrences = Collections.frequency(castes, tagcaste);
		return occurrences;
	}

	public int testTagune(int occurences, ArrayList<Tag> tags) {
		if (tags.contains(Tag.une)) {
			occurences = 1;
		}
		return occurences;
	}

	public ArrayList<Carte> testTagAutre(Carte cartep, ArrayList<Tag> tags, ArrayList<Carte> tablej) {
		if (tags.contains(Tag.autre)) {
			int last = tablej.lastIndexOf(cartep);
			tablej.remove(last);
		}
		return tablej;
	}

}