import java.util.Scanner;

public class SimpleMathLearningTool {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer = number1 + number2;
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int userAnswer = input.nextInt();
        if (userAnswer == answer) {
            System.out.println("True!");
        } else {
            System.out.println("False. The answer is " + answer + "!");
        }
    }
}
