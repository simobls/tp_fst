public abstract class volaille {

	int num;
	double poids;

	volaille(int num, double poids) {
		this.num = num;
		this.poids = poids;
	}

	public abstract double calculerprix();

	public abstract boolean verifiepoidsabatage();

	public String toString() {
		return ("num : " + num + ", poids : " + poids);
	}
}