import java.util.Scanner;
public class E5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an initial ballance: ");
        double balance = input.nextDouble();
        System.out.print("Enter monthly savings: ");
        double msaving = input.nextDouble();
        System.out.print("Enter anual growth percentage: ");
        double gpercent = input.nextDouble();
        System.out.print("Enter the number of months: ");
        double months = input.nextDouble();
        for (int i = 0; i <= months; i++) {
            balance = (msaving + balance) * (1 + gpercent * 0.01 * 1/12);
        }
        System.out.println("After " + months + " months the new balance is: $" + Math.round(balance*100.0)/100.0);
    }
}