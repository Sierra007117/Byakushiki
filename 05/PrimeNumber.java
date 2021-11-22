import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("This program can generate first N number of primes in M primes per line.");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of N: ");
        final int NOP = input.nextInt();
        System.out.print("Please enter the value of M: ");
        final int NOPPL = input.nextInt();
        int count = 0;
        int number = 2;
        System.out.println("The first " + NOP + " prime numbers are: \n");
        while (count < NOP) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
                if (count % NOPPL == 0) {
                    System.out.println();
                }
            }
            number++;
        }
        input.close();
    }

}
