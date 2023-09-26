public class ex3_POO{
	public static boolean isArmstrong(int number){
		int n = number;
		int ones = n % 10;
        int tens = (n % 100 - ones) / 10;
        int hundreds = n / 100;
		
		n = ones*ones*ones + tens*tens*tens + hundreds*hundreds*hundreds;
		return (n == number);
	}

	public static void findArmstrong(){
		int count = 0, n = 100;
		while (count < 4) {
			if (isArmstrong(n)) {
				System.out.println(n + " est un nombre d'Armstrong");
				count++;
			}
			n++;
		}
	}

	public static void main(String[] args)
	{
		findArmstrong();
	}
}