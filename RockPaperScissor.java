import java.util.Scanner;
import java.util.Random;



public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("0 for Rock\n1 for Paper\n2 for Scissor\n");
        Scanner s = new Scanner(System.in);
        int user = s.nextInt();
        Random r = new Random();
        int computer = r.nextInt(3);

        switch (user){
            case 0:
                if(computer==0){
                    System.out.println("Draw");
                }
                else if(computer==1){
                    System.out.println("Loss");
                }
                else{
                    System.out.println("Win");
                }
                break;
            case 1:
                if(computer==0){
                    System.out.println("Win");
                }
                else if(computer==1){
                    System.out.println("Draw");
                }
                else{
                    System.out.println("Loss");
                }
                break;
            case 2:
                if(computer==0){
                    System.out.println("Loss");
                }
                else if(computer==1){
                    System.out.println("Win");
                }
                else{
                    System.out.println("Draw");
                }
                break;
        }
        System.out.println(computer);

    }
}
