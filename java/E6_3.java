import java.util.Scanner;
public class E6_3 {
    public static int reverse(int number) {
        String num = Integer.toString(number);
        String numb = "";
        char ch;
        for (int i = 0; i < num.length(); i++){
            ch = num.charAt(i);
            numb = ch + numb;
        }
        int numbers;
        try {
            numbers = Integer.parseInt(numb);
        }
        catch (NumberFormatException e) {
            numbers = 0;
        }
        return numbers;
    }
    public static boolean isPalandrome(int number) {
        if(number == reverse(number)){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an intiger: ");
        int num = input.nextInt();
        System.out.println(reverse(num));
        System.out.println("The number is " + (isPalandrome(num) ? "" : "not ") + "a Palandrome");
    }
}