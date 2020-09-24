package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrimeNumber {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String n = scanner.nextLine();
		
		//check is the number is prime
		BigInteger bigInteger = new BigInteger(n);
		boolean isPrime = bigInteger.isProbablePrime(10);
		
		if(isPrime)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		scanner.close();
	}
}
