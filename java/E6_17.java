import java.util.Scanner;
public class E6_17 {
    public static void printMatrix(int n){
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int) Math.round(Math.random()*2)/2;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an intiger: ");
        int num = input.nextInt();
        printMatrix(num);
    }
}