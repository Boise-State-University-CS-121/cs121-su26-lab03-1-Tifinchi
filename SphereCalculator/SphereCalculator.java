import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
    
        System.out.print("Enter Sphere Radius: ");
        double radius = scnr.nextDouble();

        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
        
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);

        scnr.close();
    }
}