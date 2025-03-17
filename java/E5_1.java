import java.util.Scanner;

public class E5_1 {
    public static void main(String[] args) {
        double count = 0;
        double num1 = 1;
        double num2 = 0;
        Scanner input = new Scanner(System.in);
        while(num1 != 0){
            System.out.print("Enter a number: ");
            num1 = input.nextDouble();
            num2 = num2 + num1;
            count = count + 1;
        }
        System.out.println("the aveage of your numbers is: " + num2/count);
    }
}