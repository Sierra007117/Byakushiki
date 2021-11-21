import java.util.Scanner;
import java.lang.Math;

public class GPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the latitude of the 1st city: ");
        double lat1 = input.nextDouble();
        System.out.println("Enter the longitude of the 1st city: ");
        double lon1 = input.nextDouble();
        System.out.println("Enter the latitude of the 2nd city: ");
        double lat2 = input.nextDouble();
        System.out.println("Enter the longitude of the 2nd city: ");
        double lon2 = input.nextDouble();
        System.out.println("Enter the latitude of the 3rd city: ");
        double lat3 = input.nextDouble();
        System.out.println("Enter the longitude of the 3rd city: ");
        double lon3 = input.nextDouble();
        System.out.println("Enter the latitude of the 4th city: ");
        double lat4 = input.nextDouble();
        System.out.println("Enter the longitude of the 4th city: ");
        double lon4 = input.nextDouble();
        double area = 0.5 * Math
                .abs((lon1 * lat2 - lon2 * lat1 + lon3 * lat4 - lon4 * lat3 + lon4 * lat1 - lon1 * lat4) * (lon2 - lon3)
                        + (lon3 * lat1 - lon1 * lat3 + lon4 * lat2 - lon2 * lat4) * (lon1 - lon4)
                        + (lon4 * lat3 - lon3 * lat4 + lon2 * lat1 - lon1 * lat2) * (lon3 - lon2)
                        + (lon1 * lat4 - lon4 * lat1 + lon3 * lat2 - lon2 * lat3) * (lon4 - lon3));
        System.out.println("Estimate the area enclosed by four cities : " + area);
    }
}