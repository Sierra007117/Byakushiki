import java.util.Scanner;

public class GuessNumberUsingBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int guess;
        int guessCount = 0;
        boolean isGuessed = false;
        System.out.println("A number between 0 and 100.");
        while (!isGuessed) {
            System.out.print("Guess the number:");
            guess = input.nextInt();
            guessCount++;
            if (guess == number) {
                isGuessed = true;
                System.out.println("You have guessed the number.");
                System.out.println("Number of attempts : " + guessCount + " times");
                break;
            } else if (guess < number) {
                System.out.println("The number is bigger than " + guess + ".Try again.");
            } else {
                System.out.println("The number is smaller than " + guess + ".Try again.");
            }
        }
        input.close();
    }
}