import java.util.Scanner;
public class E3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter each value as a number");
        System.out.println("Enter either Month: ");
        int Month = input.nextInt();
        System.out.println("Enter either Day: ");
        int Day = input.nextInt();
        System.out.println("Enter either Year: ");
        int Year = input.nextInt();
        int Week = (2+Day + (26*(Month+1))/10 + (Year % 100) +(Year % 100)/4 + (Year / 100)/4 + 5*(Year / 100)) % 7;
        System.out.println(Week);
    }
}