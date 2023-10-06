public class equipe {

	public int max;
	public int num;
	public Object[] equipe;

	public equipe(int max) {
		this.max = max;
		equipe = new Object[max];
		num = 0;
	}

	public int capacite() {
		return (max);
	}

	public void ajoutetud(joueur jou) {
		if (size() < capacite()) {
			equipe[num] = jou;
			num++;
		}
		else{
			System.out.println("L'etablissement est pleine");
		}
	}

	public int size() {
		return (num);
	}

	public void afficher() {
		joueur jou;
		for (int i = 0; i < size(); i++) {
			jou = (joueur)equipe[i];
			jou.affichage();
		}
	}

	public int chercher(String name) {
		int pos = -1;
		joueur jou;
		for (int i = 0; i < size(); i++) {
			jou = (joueur)equipe[i];
			if (name.equals(jou.nom)){
				pos = i;
				break;
			}
		}
		return (pos);
	}

	public void supprimer(String name) {
		int pos = chercher(name);
		if (pos != -1) {
			for (int i = pos; i < size(); i++) {
				equipe[i] = equipe[i+1];
			}
			num--;
			afficher();
		}
		else {
			System.out.println("aucune joueur a ete supprimer");
		}
	}

}
