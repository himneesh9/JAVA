import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        // Practice problem 1
      /*  for(int i = 0 ; i<4 ; i++){
            for(int l = 4 ; l > i ; l--){
                   System.out.print("*");

               }
            System.out.print("\n");
           }
              */
        // Practice problem 2
     /*   System.out.println("enter the value of n ");
        int n = s.nextInt();
        int sum = 0 ;
        for(int i = 0 ; i<n ; i++) {

            sum = sum + 2*i;
        }
        System.out.println("sum of first even number:" +sum);
     */
      // Practice problem 3
    /*    System.out.println("enter value of n: ");
        int n = s.nextInt();
        for(int i =1 ; i<=10 ; i++){
            System.out.print(n);
            System.out.print("*"+i);
            System.out.print("="+n*i);
            System.out.print("\n");
        }
    */
        // Pratice problem 4
    /*    int n = 10;
        for(int i = 10 ; i > 0 ; i--){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
     */
        // Practice problem 5
     /*   System.out.println("Enter any number");
        int n = s.nextInt();
        int sum = 1;
        for(int i=1;i<=n;i++){
            sum = sum*i;
        }
        System.out.println("factorial="+sum);
    */
        // Practice problem 6
        int n=5;
        int sum=1;
        for(int i = 1; i<= n ; i++){
            sum *= n*i;
        }
        System.out.println(sum);
    }

}
