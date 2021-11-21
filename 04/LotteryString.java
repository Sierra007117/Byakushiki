import java.util.Scanner;

public class LotteryString {
    public static void main(String[] args) {
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("Pleae enter a two digit number");
        String guess = input.nextLine();
        char random_number_digit1 = lottery.charAt(0);
        char random_number_digit2 = lottery.charAt(1);
        char user_input_digit1 = guess.charAt(0);
        char user_input_digit2 = guess.charAt(1);
        if (guess.equals(lottery))
            System.out.println("User input matches the lottery in exact order, the award is $10,000.");
        else if (user_input_digit2 == random_number_digit1 && user_input_digit1 == random_number_digit2)
            System.out.println("User input matches the lottery, the award is $3,000.");
        else if (user_input_digit1 == random_number_digit1 || user_input_digit1 == random_number_digit2
                || user_input_digit2 == random_number_digit1 || user_input_digit2 == random_number_digit2)
            System.out.println("One digit in the user input matches a digit in the lottery, the award is $1,000.");
        else
            System.out.println("No digits in the user input match a digit in the lottery, the award is $0.");
    }
}
