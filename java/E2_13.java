import java.util.Scanner;
public class E2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Monthly Savings: ");
        double msaving = input.nextDouble();
        double balance = 0;
        for (int i = 0; i < 6; i++) {
            balance = (msaving + balance) * 1.00417;
        }
        System.out.println("After six months the new balance is: " + balance);
    }
}