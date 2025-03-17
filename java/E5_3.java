import java.util.Scanner;
public class E5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number in kg to convert it to lbs: ");
            float kg = input.nextFloat();
            System.out.println("Converted to lbs is: " + Math.round(kg*2.2 * 10.0)/10.0);
        }
    }
}