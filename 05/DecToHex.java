import java.util.Scanner;

public class DecToHex {
    public static void main(String args[]) {
        char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int rem, num;
        String hexadecimal = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the the decimal number: ");
        num = input.nextInt();
        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        System.out.println("Converted hexadecimal number is: " + hexadecimal);
        input.close();
    }
}
