public class E5_11 {
    public static void main(String[] args) {
        int count = 0;
        for(double i = 100;i<=200;i++){
            if(i/5==Math.round(i/5) ^ i/6==Math.round(i/6)){
                System.out.print(i + " ");
                count++;
                if(count==10){
                    System.out.println("");
                    count = 0;
                }
            }
        }
    }
}