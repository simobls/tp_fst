public class ex1_POO {
    public static void main(String[] args) {
        System.out.println("Donner la taille du tableau :");
        int size = Tableau.clavier();

        Tableau fst = new Tableau(size);
        fst.lire(fst.tab);
        fst.afficher(fst.tab, size);
        fst.trier();
        fst.afficher(fst.tab, size);
        int t = fst.rechercher(11);
        if (t == -1) {
            System.out.println("le nombre q'on cherche n'exist pas dans le tableau");
        } else {
            System.out.println("le nombre q'on cherche exist dans le tableau, sa position est " + t);
        }
    }
}
