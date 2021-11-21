import java.util.Scanner;

public class HexToDec {
    public static int hex_to_dec(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String args[]) {
        String HEX;
        int DEC;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the hexadecimal number: ");
        HEX = scan.nextLine();
        DEC = hex_to_dec(HEX);
        System.out.print("Converted decimal number is: " + DEC + "\n");
    }
}