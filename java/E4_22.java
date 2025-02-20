import java.util.Scanner;
public class E4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.next();
        System.out.print("\nEnter a string: ");
        String str2 = input.next();
        if(str1.contains(str2)) {
         System.out.println("your first string contains your second string");
        } else {
            System.out.println("your first string des not contain your second string");
        }
    }
}