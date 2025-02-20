import java.util.Scanner;
public class E4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of an ascii charecter (0-127): ");
        double charecter = input.nextDouble();
        String ascii = Character.toString ((char) charecter);
        System.out.println(ascii);
    }
}