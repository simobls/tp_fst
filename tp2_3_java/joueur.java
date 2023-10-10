import java.util.Scanner;

public class joueur {

	public int id;
	public String nom;
	public String prenom;
	public String natio;

	public joueur(int id){
		this.id = id;
	}

	public static String clavier(){
		Scanner in = new Scanner(System.in);
		return (in.nextLine());
	}

	public void lecture() {
		System.out.println("Entrer le nom du joueur");
		nom = clavier();
		System.out.println("Entrer le prenom du joueur");
		prenom = clavier();
		System.out.println("Entrer la date de naissance du joueur");
		natio = clavier();
	}

	public void affichage() {
		System.out.println("id du joueur : " + id);
		System.out.println("le nom du joueur : " + nom);
		System.out.println("le prenom du joueur : " + prenom);
		System.out.println("date de naissance joueur : " + natio);
	}
}