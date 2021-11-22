import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        int num1, num2, answer;
        int correct = 0;
        int incorrect = 0;
        int i = 0;
        int total = 0;
        int correctPercentage, incorrectPercentage, totalPercentage;
        Scanner input = new Scanner(System.in);
        while (i < 5) {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);
            System.out.println("What is " + num1 + " - " + num2 + "?");
            answer = num1 - num2;
            int userAnswer = input.nextInt();
            if (userAnswer == answer) {
                correct++;
                i++;
            } else {
                incorrect++;
                i++;
            }
        }
        total = correct + incorrect;
        correctPercentage = correct * 100 / total;
        incorrectPercentage = incorrect * 100 / total;
        totalPercentage = total * 100 / total;
        System.out.println("Correct: " + correct + " (" + correctPercentage + "%)" + " " + "Incorrect: " + incorrect
                + " (" + incorrectPercentage + "%)" + " " + "Total: " + total + " (" + totalPercentage + "%)");
        input.close();
    }
}
