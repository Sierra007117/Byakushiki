import java.util.Scanner;

public class ComputingAnglesofaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = input.nextDouble();
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = input.nextDouble();
        System.out.print("Enter the x-coordinate of the third point: ");
        double x3 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the third point: ");
        double y3 = input.nextDouble();
        double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double C = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        System.out.println("The angle between a and b is " + C * 180 / Math.PI + " degrees");
        System.out.println("The angle between b and c is " + A * 180 / Math.PI + " degrees");
        System.out.println("The angle between a and c is " + B * 180 / Math.PI + " degrees");
    }
}