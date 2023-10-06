import java.util.Scanner;

public class etudiant {

	public int ord;
	public String nom;
	public String prenom;
	public String date;
	public int CNE;
	public float[] notes = new float[4];

	public etudiant(int ord){
		this.ord = ord;
	}

	public static String clavier(){
		Scanner in = new Scanner(System.in);
		return (in.nextLine());
	}

	public void lecture() {
		String tmp;
		System.out.println("Entrer le nom d'etudiant");
		nom = clavier();
		System.out.println("Entrer le prenom d'etudiant");
		prenom = clavier();
		System.out.println("Entrer la date de naissance d'etudiant");
		date = clavier();
		System.out.println("Entrer le CNE d'etudiant");
		tmp = clavier();
		CNE = Integer.parseInt(tmp);
		System.out.println("Entrer les notes d'etudiant");
		for (int i = 0; i < 4; i++) {
			System.out.println("Note du module " + (i+1));
			tmp = clavier();
			notes[i] = Float.parseFloat(tmp);
		}
	}

	public float calcul() {
		float sum = 0;
		for (int i = 0; i < 4; i++) {
			sum = sum + notes[i];
		}
		sum = sum/4;
		return (sum);
	}

	public void affichage() {
		System.out.println("numero d'ordre : " + ord);
		System.out.println("le nom d'etudiant : " + nom);
		System.out.println("le prenom d'etudiant : " + prenom);
		System.out.println("date de naissance d'etudiant : " + date);
		System.out.println("CNE : " + CNE);
		System.out.println("sa moyenne est :" + calcul());
	}

	public boolean valide() {
		return (calcul() >= 10 && notes[0] >= 7 && notes[1] >= 7 && notes[2] >= 7 && notes[3] >= 7);
	}
}