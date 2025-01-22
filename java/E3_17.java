import java.util.Scanner;
public class E3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter either Rock, Paper, or Scisors: ");
        String usrrps = input.next();
        double rps = Math.round(Math.random()*2);
        if(rps == 0){
            if("Rock".equals(usrrps)){
                System.out.print("Draw");
            }else if("Paper".equals(usrrps)){
                System.out.print("Win");
            }else if("Scisors".equals(usrrps)){
                System.out.print("Loose");
            }else{
                System.out.print("Invalid");
            }
        }else if(rps == 1){
            if("Paper".equals(usrrps)){
                System.out.print("Draw");
            }else if("Scisors".equals(usrrps)){
                System.out.print("Win");
            }else if("Rock".equals(usrrps)){
                System.out.print("Loose");
            }else{
                System.out.print("Invalid");
            }
        }else if(rps == 2){
            if("Scisors".equals(usrrps)){
                System.out.print("Draw");
            }else if("Rock".equals(usrrps)){
                System.out.print("Win");
            }else if("Paper".equals(usrrps)){
                System.out.print("Loose");
            }else{
                System.out.print("Invalid");
            }
        }
    }
}