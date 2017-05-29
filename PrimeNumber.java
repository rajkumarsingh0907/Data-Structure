import java.util.Scanner;

/**
 * Java Program to Check whether a Input Number is Prime or Not
 *
 * Source - http://webrewrite.com/java-program-check-prime-number/
 * 
 * 7 = 1, 7 - Prime number
 * 6 = 1, 2 , 3 and 6 - Not a Prime Number
 * 11 = 1, 11 - Prime Number
 */

public class PrimeNumber {

	public static boolean checkPrime(int n) {

		for (int i = 2; i < Math.sqrt(n); i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
				
		int n = in.nextInt();
		
		if(n >= 2 && checkPrime(n)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}

}
