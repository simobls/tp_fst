package java.tp2;
import java.util.Scanner;

public class Tableau {
	public int taille;
	public int[] tab;

	// Create an array of ints, the size is given as the int t.
	Tableau(int t) {
		taille = t;
		tab = new int[taille];
	}
	
	// Declare & return a Scanner
	public static int clavier() {
		Scanner clav = new Scanner(System.in);
		return (clav.nextInt());
	}

	// Saves the data typed by the user into the array
	public void lire() {
		System.out.println("Entrez les elements du tableau :");
		for (int i = 0; i < taille; i++) {
			System.out.println("element nº:" + (i+1) + " :");
			tab[i] = clavier();
		}
	}

	// Prints the elements of the array
	public void afficher() {
		System.out.println("Affichage :");
		for (int i = 0; i < taille; i++) {
			System.out.println("element nº" + (i+1) + " : est " + tab[i]);
		}
	}

	public void trier() {
		int min, tmp;
		for (int i = 0; i < taille - 1; i++) {
			min = tab[i];
			for (int j = i + 1; j < taille; j++) { // Fix the inner loop condition
				if (min > tab[j]) {
					tmp = min;
					min = tab[j];
					tab[j] = tmp;
				}
			}
			tab[i] = min; // Move the minimum value to the correct position
		}
	}
}

