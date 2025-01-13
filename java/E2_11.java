import java.util.Scanner;
public class E2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years for population growth: ");
        int years = input.nextInt();
        int population = 312032486;
        System.out.println("Current population: " + population);
        int npopulation = (population + (years * 365 * 24 * 60 * 60 / 7) - (years * 365 * 24 * 60 * 60 / 13) + (years * 365 * 24 * 60 * 60 / 45));
        System.out.println("The population growth after " + years + ": " + (npopulation - (years - 1)));
    }
}