public class ex3 {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        while (count < 4) {
            int ones = n % 10;
            int tens = (n % 100 - ones) / 10;
            int hundreds = n / 100;
            
            int test = (int) (Math.pow(ones, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3));
            
            if (test == n) {
                System.out.println(n + " est un nombre d'Armstrong");
                count++;
            }
            n++;
        }
        
        if (count == 0) {
            System.out.println("Aucun nombre d'Armstrong trouvé dans la plage spécifiée.");
        }
    }
}
