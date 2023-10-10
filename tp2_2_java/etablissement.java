public class etablissement {

	public int max;
	public etudiant[] tab;
	public int nbr, nv;

	public etablissement(int t) {
		max = t;
		tab = new etudiant[max];
		nbr = 0;
	}

	public int capacite() {
		return (max);
	}

	public void ajoutetud(etudiant etd) {
		if (size() < capacite()) {
			tab[nbr] = etd;
			nbr++;
		}
		else{
			System.out.println("L'etablissement est pleine");
		}
	}

	public int size() {
		return (nbr);
	}

	public void afficher() {
		for (int i = 0; i < size(); i++) {
			tab[i].affichage();
		}
	}

	public etudiant[] etud_valide() {
		etudiant[] A = new etudiant[max];
		int j = 0;
		for (int i = 0; i < size(); i++) {
			if (tab[i].valide()) {
				A[j] = tab[i];
				j++;
			}
			nv = j;
		}
		return (A);
	}

	public String mention(float n) {
		String ch = null;
		if (n < 12) {
			ch = "passable";
		} else if (n < 14) {
			ch = "assez-bien";
		} else if (n < 16) {
			ch = "bien";
		} else {
			ch = "bien";
		}
		return (ch);
	}

	public void tri_affiche() {
		etudiant[] B = etud_valide();
		int pos;
		for (int i = 0; i < nv - 1; i++) {
			pos = i;
			for (int j = i + 1; j < nv - 1; j++) {
				if (B[j].calcul() > B[pos].calcul()) {
					pos = j;
				}
			}
			if (i != pos) {
				etudiant e = B[i];
				B[i] = B[pos];
				B[pos] = e;
			}
		}
		for (int i = 0; i < nv; i++) {
			B[i].affichage();
			System.out.println("mention : " + mention(B[i].calcul()));
		}
	}
}
