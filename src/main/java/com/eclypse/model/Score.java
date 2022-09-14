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

	public int suite(Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Long> valeurs =null;
		int suite=0;
		for (Carte carte : table) {
			valeurs.add((long) carte.getValeur());
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
	
	public int couleur(Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Couleur> couleurs =null;
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

			if(rouge==5 || vert==5 || bleu==5 || orange==5 || jaune==5) {
				couleurv=10;
			}
			else if(rouge==4 || vert==4 || bleu==4 || orange==4 || jaune==4) {
				couleurv=5;
			}
			else if(rouge==3 || vert==3 || bleu==3 || orange==3 || jaune==3) {
				couleurv=3;
			}
		}
		return couleurv;
	}
	
	public int famille (Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Couleur> couleurs =null;
		int famille=0;
		for (Carte carte : table) {
			couleurs.add(carte.getCouleur());
		}
		int rouge=0;
		int vert=0;
		int bleu=0;
		int orange=0;
		int jaune=0;
		ArrayList<Long> occurences=null;
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
			if(rouge!=0) {occurences.add((long) rouge);}
			if(vert!=0) {occurences.add((long) vert);}
			if(bleu!=0) {occurences.add((long) bleu);}
			if(orange!=0) {occurences.add((long) orange);}
			if(jaune!=0) {occurences.add((long) jaune);}
			

			if(occurences.size()==5) {
				famille=10;
			}
			else if(occurences.size()==4) {
				famille=5;
			}
			else if(occurences.size()==3) {
				famille=3;
			}
		}
		return famille;
	}
	
	public int caste (Joueur joueur) {
		ArrayList <Carte> table=joueur.getTable();
		ArrayList <Caste> castes =null;
		int castev=0;
		for (Carte carte : table) {
			castes.add(carte.getCaste());
		}
		int noble=0;
		int guildien=0;
		int pretre=0;
		ArrayList<Long> occurences=null;
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
		ArrayList <Caste> castes =null;
		Caste castej= joueur.getCaste();
		int synergie=0;
		for (Carte carte : table) {
			castes.add(carte.getCaste());
		}
		int noble=0;
		int guildien=0;
		int pretre=0;
		ArrayList<Long> occurences=null;
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
}
