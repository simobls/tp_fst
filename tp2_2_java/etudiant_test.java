public class etudiant_test {
	public static void main(String[] args){
		System.out.println("entrer le max :");
		int max = Integer.parseInt(etudiant.clavier());
		etablissement etab = new etablissement(max);
		for (int i = 0; i < max; i++) {
			System.out.println("Entrer l'ordre d'etudiant");
			etudiant etd = new etudiant(Integer.parseInt(etudiant.clavier()));
			etd.lecture();
			etab.ajoutetud(etd);
		}
		etab.afficher();
		etab.tri_affiche();
	}
}
