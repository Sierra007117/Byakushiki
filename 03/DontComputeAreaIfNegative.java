import java.util.Scanner;

public class DontComputeAreaIfNegative {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        radius = input.nextInt();
        area = radius * radius * 3.14159;
        if (radius < 0) {
            System.out.println("The radius cannot be negative");
        } else {
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }

    }
}
