import java.util.Scanner;

public class Lottery {
    public static void main(String args[]) {
        int random_number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Pleae enter a two digit number");
        int user_input = input.nextInt();
        int random_number_digit1 = random_number / 10;
        int random_number_digit2 = random_number % 10;
        int user_input_digit1 = user_input / 10;
        int user_input_digit2 = user_input % 10;
        boolean exact_match = random_number == user_input;
        boolean match_all_digits = random_number_digit1 == user_input_digit2
                && random_number_digit2 == user_input_digit1;
        boolean match_one_digit = random_number_digit1 == user_input_digit1 || random_number_digit1 == user_input_digit2
                || random_number_digit2 == user_input_digit1 || random_number_digit2 == user_input_digit2;
        if (exact_match) {
            System.out.println("User input matches the lottery in exact order, the award is $10,000.");
        } else if (match_all_digits) {
            System.out.println("User input matches the lottery, the award is $3,000.");
        } else if (match_one_digit) {
            System.out.println("One digit in the user input matches a digit in the lottery, the award is $1,000.");
        } else {
            System.out.println("No digits in the user input match a digit in the lottery, the award is $0.");
        }
    }
}