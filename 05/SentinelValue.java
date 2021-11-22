import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, The input 0 signifies the end of the input: ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("sentinel value entered. Program terminated.");
            System.exit(1);
        }
        while (number != 0) {
            sum += number;
            System.out.print("Enter another integer: ");
            number = input.nextInt();
        }
        input.close();
        System.out.println("Sum : " + sum);
    }
}