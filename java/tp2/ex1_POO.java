package java.tp2;

import java.util.Scanner;

public class ex1_POO {
	public int taille;
	public int[] tab;

	// Create an array of ints, the size is given as the int t.
	void tableau(int t) {
		taille = t;
		tab = new int[taille];
	}
	
	// Declare & return a Scanner
	int clavier() {
		Scanner clav = new Scanner(System.in);
		return (clav.nextInt());
	}

	// Saves the data typed by the user into the array
	public void lire() {
		
	}

}