import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int number = 1;
		System.out.println("--- Prime numbers ---");
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				System.out.println("Enter a number: ");
				number = scanner.nextInt();
				if (primeNumber(number)) {
					System.out.println(number + " is a prime number");
				} else {
					System.out.println(number + " is not a prime number");
				}
			} catch (InputMismatchException e) {
				System.out.println("Is not a number");
			}
		}
	}

	public static boolean primeNumber(Integer number) {
		if (number % 2 == 0) {
			return false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
