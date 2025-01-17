import java.util.Scanner;
public class E3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a coin flip guess (0 heads) (1 tails): ");
        double guess = input.nextDouble();
        double flip = Math.round(Math.random()*2)/2;
        if(flip == guess){
            System.out.println("You guessed right");
        }else{
            System.out.println("You guessed wrong");
        }
    }
}