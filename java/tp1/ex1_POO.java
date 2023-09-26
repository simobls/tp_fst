public class ex1_POO{
	private int A;
	private int B;

	public ex1_POO(int A, int B){
		this.A = A;
		this.B = B;
	}

	public int calcul(){
		int tmp, r;
		if (B == 0) {
			return (-1);
		}
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
		}
		return (B);
	}

	public void afficher(int r){
		r = calcul();
		if (r == -1)
			System.out.println("error");
		else
			System.out.println("le PGCD est : " + r);
	}

	public static void main(String[] args)
	{
		ex1_POO p = new ex1_POO(16, 4);
		int r = p.calcul();
		p.afficher(r);
	}
}
