import java.util.Scanner;
public class E3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4 digit integer: ");
        long value = input.nextLong();
        input.close();
        System.out.println(value);
        int count = 0;
        int f = 0;
        int g = 0;
        while (value != 0) {
            count++;
            int digit = (int) (value % 10);
            value /= 10;
            if(count == 1){
                f = digit;
            }
            if(count == 2){
                g = digit;
            }
            if(count == 3){
                if(g == digit && value == f){
                    System.out.println("the number is a paldrome");
                }else{
                    System.out.println("the number is not a paldrome");
                }
            }
        }
    System.out.println();
    }
}