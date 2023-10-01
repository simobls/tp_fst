package java.tp2;

public class ex1_POO {
    public static void main(String[] args) {
        System.out.println("Donner la taille du tableau :");
        int size = Tableau.clavier();

        Tableau fst = new Tableau(size);
        fst.lire();
        fst.afficher();
        fst.trier(); // Implement your sorting method here.
        fst.afficher();
    }
}