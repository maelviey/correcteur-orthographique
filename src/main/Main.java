package main;

import java.util.Arrays;
import java.util.ArrayList;

import util.ACX;

public class Main {
	// Fonction Recherche naîve => O(n) : Linéaire
	public static int recherche(String cherche, String[] t){
		for(int i = 0; i < t.length; i++){ 
			if(cherche.compareTo(t[i]) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	//Fonction estTrie
		public static boolean estTrie(String[] tableau) {
	        for (int i = 0; i < tableau.length - 1; i++) {
	            if (tableau[i].compareTo(tableau[i + 1]) > 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }
		
	// Fonction Recherche Dichotomique => O(Log n) : Logaritmique
	public static int rechercheDichoStr(String cherche, String[] t) {
		if(estTrie(t) == false) {
			ACX.erreur("Le tableau doit etre trie");
		}
		int debut = 0;
		int fin = t.length - 1;
		while(debut<=fin){
			int millieu = (debut + fin)/2;
			if (cherche.compareTo(t[millieu]) == 0){
				return millieu;
			}
			else {
				if(cherche.compareTo(t[millieu])>0){
					debut = millieu+1;
				}
				else {
					fin = millieu-1;
				}
			}
			
		}
		return -1;

	}
	
	//Fonction tri => O(n²) : Quadratique
	public static String[] triParInsertion(String[] tableau) {
        int n = tableau.length;
        String[] tableauTrie = Arrays.copyOf(tableau, n);

        for (int i = 1; i < n; i++) {
            String cle = tableauTrie[i];
            int j = i - 1;
            while (j >= 0 && tableauTrie[j].compareTo(cle) > 0) {
                tableauTrie[j + 1] = tableauTrie[j];
                j = j - 1;
            }
            tableauTrie[j + 1] = cle;
        }

        return tableauTrie;
    }
	//Ouverture du dico trié
	public static String[] dico = ACX.lectureDico("lib/dicoTrie.txt");
	
	
	//Fonction corriger avec la recherche naîve
	public static boolean [] corriger(String[] texte, String[] dico){
		int taille_text = texte.length;
		boolean[] tab = new boolean [taille_text];
		for(int i = 0; i < taille_text; i++) {
			if (recherche(texte[i].toLowerCase(),dico) != -1) {
				tab[i] = true;
			}
			else {
				tab[i] = false;
			}
		}
		return tab;	
	}
	
	//Fonction corriger avec la recherche dicotomique 
	public static boolean [] corrigerParDico(String[] texte, String[] dico){
		int taille_text = texte.length;
		boolean[] tab = new boolean [taille_text];
		for(int i = 0; i < taille_text; i++) {
			if (rechercheDichoStr(texte[i].toLowerCase(),dico) != -1) {
				tab[i] = true;
			}
			else {
				tab[i] = false;
			}
		}
		return tab;	
	}

	//Fonction corrigerNaif
	public static boolean [] corrigerNaif(String[] texte){
		return corriger(texte,dico);
	}
	
	//Fonction corrigerDico
	public static boolean [] corrigerDico(String[] texte){
		return corrigerParDico(texte,dico);	
	}
	
	//Fonction distanceHamming
	public static int distanceHamming(String mot1, String mot2) {
	    int distance = 0;
	    for (int i = 0; i < mot1.length(); i++) {
	        if (mot1.charAt(i) != mot2.charAt(i)) {
	            distance++;
	        }
	    }
	    return distance;
	}
	
	//Fonction proposerCorrection
	public static String[] proposerCorrection(String mot) { 
	    ArrayList<String> listeProposition= new ArrayList<>(); //J'utilse une ArrayList pour avoirs un tableau de taille variable
	    for(int i = 0; i < dico.length; i++) {
	    	if(dico[i].length() == mot.length()&& distanceHamming(mot, dico[i]) == 1) {
	    		listeProposition.add(dico[i]);
	    	}
	    }
	    return listeProposition.toArray(new String[listeProposition.size()]);
	}
	
	
	public static void main(String[] args){
		ACX.interfaceCorrection("corrigerDico","proposerCorrection");
	}
	
}
