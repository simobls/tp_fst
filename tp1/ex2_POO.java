public class ex2_POO{
	private int A;

	public ex2_POO(int A){
		this.A = A;
	}
	public double calcul()
	{
		double UN = 1, UN1 = 1;
		do {
			UN = UN1;
			UN1 = (0.5) * (UN1 + A/UN1);
		} while ((Math.abs (UN1 - UN) ) >=  0.001);
		return (UN1);
	}

	public void afficher(double r)
	{
		System.out.println("la racine carre de " + A + " est : " + r);
	}

	public static void main(String[] args)
	{
			ex2_POO p = new ex2_POO(16);
			double r = p.calcul();
			p.afficher(r);
	}
}