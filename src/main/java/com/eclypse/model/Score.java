
package com.eclypse.model;

import java.util.ArrayList;

public class Score {
	private int valeur;

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public Score(int valeur) {
		this.valeur = valeur;
	}
	
	@Override
	public String toString() {
		return ""+valeur+"";
	}
	
	public int suite(Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Integer> valeurs =new ArrayList <Integer>();
		int suite=0;
		for (Carte carte : table) {
			valeurs.add((int) carte.getValeur());
		}
		if(valeurs.contains(1)&&valeurs.contains(2)&&valeurs.contains(3))
			if (valeurs.contains(4)) {
				if (valeurs.contains(5)) {
					suite=10;
				}
				else {
					suite=5;
				}
			}
			else {
				suite=3;
			}
		return suite;
	}
	
	public int famille(Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Couleur> couleurs =new ArrayList <Couleur>();
		int couleurv=0;
		for (Carte carte : table) {
			couleurs.add(carte.getCouleur());
		}
		int rouge=0;
		int vert=0;
		int bleu=0;
		int orange=0;
		int jaune=0;
		for (Couleur couleur : couleurs) {
			switch (couleur) {
			case rouge:
				rouge++;
				break;
			case vert:
				vert++;
				break;
			case bleu:
				bleu++;
				break;
			case orange:
				orange++;
				break;
			case jaune:
				jaune++;
				break;
			}

			if(rouge==3 || vert==3 || bleu==3 || orange==3 || jaune==3) {
				couleurv=5;
			}
		}
		return couleurv;
	}
	
	public int couleur(Joueur joueur) {
		ArrayList<Carte> table = joueur.getTable();
		ArrayList<Couleur> couleurs = new ArrayList<Couleur>();
		int sccouleur = 0;
		for (Carte carte : table) {
			couleurs.add(carte.getCouleur());
		}
		int rouge = 0;
		int vert = 0;
		int bleu = 0;
		int orange = 0;
		int jaune = 0;
		ArrayList<Long> occurences = new ArrayList<Long>();
		for (Couleur couleur : couleurs) {
			switch (couleur) {
			case rouge:
				rouge++;
				break;
			case vert:
				vert++;
				break;
			case bleu:
				bleu++;
				break;
			case orange:
				orange++;
				break;
			case jaune:
				jaune++;
				break;
			}
		}
		if (rouge != 0) {
			occurences.add((long) rouge);
		}
		if (vert != 0) {
			occurences.add((long) vert);
		}
		if (bleu != 0) {
			occurences.add((long) bleu);
		}
		if (orange != 0) {
			occurences.add((long) orange);
		}
		if (jaune != 0) {
			occurences.add((long) jaune);
		}

		if (occurences.size() == 5) {
			sccouleur = 10;
		} else if (occurences.size() == 4) {
			sccouleur = 5;
		} else if (occurences.size() == 3) {
			sccouleur = 3;
		}
		return sccouleur;
	}
		
	
	public int caste (Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Caste> castes =new ArrayList <Caste>();
		int castev=0;
		for (Carte carte : table) {
			castes.add(carte.getCaste());
		}
		int noble=0;
		int guildien=0;
		int pretre=0;
		ArrayList<Long> occurences=new ArrayList<Long>();
		for (Caste caste : castes) {
			switch (caste) {
			case noble:
				noble++;
				break;
			case guildien:
				guildien++;
				break;
			case pretre:
				pretre++;
				break;
			}
			if(noble==5 || guildien==5 || pretre==5) {
				castev=10;
			}
			else if(noble==4 || guildien==4 || pretre==4) {
				castev=5;
			}
			else if(noble==3 || guildien==3 || pretre==3) {
				castev=3;
			}
		}
		return castev;
	}
	
	public int synergie (Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Caste> castes = new ArrayList <Caste>();
		Caste castej= joueur.getCaste();
		int synergie=0;
		for (Carte carte : table) {
			castes.add(carte.getCaste());
		}
		int noble=0;
		int guildien=0;
		int pretre=0;
		ArrayList<Long> occurences=new ArrayList<Long>();
		for (Caste caste : castes) {
			switch (caste) {
			case noble:
				noble++;
				break;
			case guildien:
				guildien++;
				break;
			case pretre:
				pretre++;
				break;
			}
		if(castej==Caste.noble) {synergie=noble;}
		else if(castej==Caste.guildien) {synergie=guildien;}
		else if(castej==Caste.pretre) {synergie=pretre;}
		}
		return synergie;
	}
	
	public int scorecartes (Joueur joueur) {
		ArrayList <Carte> table = joueur.getTable();
		int scorecartes=0;
		for (Carte carte : table) {
			scorecartes+= carte.getValeur();
		}
	
		return scorecartes;
	}
}