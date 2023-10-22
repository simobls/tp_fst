public class canard extends volaille{

	static double prix_kilo;
	static double poids_abat;

	canard(int n, double p, double pk, double pa){
		super(n, p);
		prix_kilo = pk;
		poids_abat = pa;
	}

	public double calculerprix() {
		return (prix_kilo*poids);
	}

	public boolean verifiepoidsabatage() {
		return (poids >= poids_abat);
	}

	public String toString() {
		return (super.toString() + ", prix en kilo : " + prix_kilo + "poids d;abattage : " + poids_abat);
	}
}

