import java.util.Scanner;

public class Tableau {
	public int taille;
	public int[] tab;

	// Create an array of ints, the size is given as the int t.
	public Tableau(int t) {
		taille = t;
		tab = new int[taille];
	}

	// Declare & return a Scanner
	public static int clavier() {
		Scanner clav = new Scanner(System.in);
		return (clav.nextInt());
	}

	// Saves the data typed by the user into the array
	public void lire(int[] t) {
		System.out.println("Entrez les elements du tableau :");
		for (int i = 0; i < taille; i++) {
			System.out.println("Element nº:" + (i+1) + " :");
			t[i] = clavier();
		}
	}

	// Prints the elements of the array
	public void afficher(int[] t, int n) {
		taille = n;
		System.out.println("Affichage :");
		for (int i = 0; i < taille; i++) {
			System.out.println("Element nº" + (i+1) + " : est " + t[i]);
		}
	}

	// selection sort
	public void trier() {
		int min, tmp;
		for (int i = 0; i < taille - 1; i++) {
			min = tab[i];
			for (int j = i + 1; j < taille; j++) {
				if (min > tab[j]) {
					tmp = min;
					min = tab[j];
					tab[j] = tmp;
				}
			}
			tab[i] = min;
		}
	}

	// binary search - Recherche dichotomique
	public int rechercher(int t) {
		int min = 0, max = taille - 1, milieu;
		while (min <= max) {
			milieu = min + (max - min)/2;
			if (tab[milieu] == t) {
				return (milieu);
			}
			else if (tab[milieu] > t) {
				min = milieu;
			}
			else {
				max = milieu;
			}
		}
		return (-1);
	}
}
