import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();
        System.out.println("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.2f", bmi);
        if (bmi < 18.5) {
            System.out.println("\nYou are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("\nYou are normal.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("\nYou are overweight.");
        } else {
            System.out.println("\nYou are obese.");
        }
    }
}