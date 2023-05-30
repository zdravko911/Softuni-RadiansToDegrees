import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite radijane:");
        double radians = scan.nextDouble();
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);


    }
}
