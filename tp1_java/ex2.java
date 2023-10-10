import java.util.Scanner;
public class ex2 {

	/**
	 * @param args
	 */

	public static void main(String[] args){
		double UN = 1.0, UN1 = 1.0, A;
		Scanner in = new Scanner(System.in);

		System.out.println("entrer un nombre :");
		A = in.nextDouble();
		do {
			UN = UN1;
			UN1 = (0.5) * (UN + A/UN);
		} while ((Math.abs (UN1 - UN) ) >=  0.001);

		System.out.println("la racine carre de " + A + " est : " + UN1);
	}
}
