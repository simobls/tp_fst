import java.util.Scanner;

/**
 * test
 */
public class ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A, B, r, tmp;

		A = in.nextInt();
		B = in.nextInt();
		if (B > A)
		{
			tmp = B;
			B = A;
			A = tmp;
		}
		if (B != 0) {
			r = A % B;
			while (r != 0)
			{
				A = B;
				B = r;
				r = A % B;
			}
			System.out.println("le PGCD est : " + B);
		}
		else {
			System.out.println("error");
		}
	}
}
