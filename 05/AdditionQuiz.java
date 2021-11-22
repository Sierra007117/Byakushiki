import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer = number1 + number2;
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int userAnswer = input.nextInt();
        while (userAnswer != answer) {
            System.out.println("False! Try again.");
            userAnswer = input.nextInt();
        }
        System.out.println("True!");
        input.close();
    }
}