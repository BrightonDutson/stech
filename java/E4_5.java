import java.util.Scanner;
public class E4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides your polygon has: ");
        double sides = input.nextDouble();
        System.out.println("Enter the side length that each side shars: ");
        double len = input.nextDouble();
        double polyarea = (sides * (Math.pow(len, 2)))/(4*Math.tan(Math.PI / sides));
        System.out.println(polyarea);
    }
}