import java.util.Scanner;
public class E3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3 digit integer: ");
        long value = input.nextLong();
        input.close();
        System.out.println(value);
        int count = 0;
        int f = 0;
        while (value != 0) {
            count++;
            int digit = (int) (value % 10);
            value /= 10;
            if(count == 1){
                f = digit;
            }
            if(count == 3){
                if(f == digit){
                    System.out.println("the number is a paldrome");
                }else{
                    System.out.println("the number is not a paldrome");
                }
            }
        }
    System.out.println();
    }
}