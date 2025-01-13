import java.util.Scanner;
public class E2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Degree in Celsius: ");
        double degree_c = input.nextDouble();
        System.out.println(degree_c + " Celsius is " + (degree_c * ( 9.0 / 5 ) + 32) + " Farenheit");
    }
}