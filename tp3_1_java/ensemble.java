import java.util.Scanner;

public class ensemble {
	
	public int n;
	public int nv;
	public int max;
	public volaille[] tab;

	ensemble(int max){
		this.max = max;
		n = 0;
		nv = 0;
		tab = new volaille[max];
	}
	
	static String clavier(){
		Scanner clav = new Scanner(System.in);
		return (clav.nextLine());
	}

	public void ajoutvolaille(volaille v){
		if (n < max) {
			tab[n] = v;
			n++;
		}
		else {
			System.out.println("Depacement de capacite");
		}
	}

	public void affichervolaille(volaille v){
		System.out.println("Liste des volailles enregistres :");
		for (int i = 0; i < n; i++) {
			System.out.println(tab[i].toString());
		}
	}

	public static void main(String[] args) {
	}
}
