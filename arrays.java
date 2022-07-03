import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          //Problem 1
           float  [] number = {12.2f,13.8f,10.0f,28.6f,46.4f};
            float sum = 0.0f;
            for (int i = 0 ; i<= number.length - 1 ; i++){
                sum += number[i];
            }
        System.out.println("Sum is:" +sum);


        //Problem 2
   System.out.println("Input an array");
        int [] numbers = new int[5];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = s.nextInt();
        }
        System.out.println("Input number to find:");
        int findnumber = s.nextInt();
        int a = 0 ;
        for(int j = 0; j<numbers.length; j++) {
            if (findnumber == numbers[j]) {
                a = 1;
            }
        }
            if (a==1){
                System.out.println("Number found:");
            }
            else{
                System.out.println("Number not found:");
            }

        //Problem 3
        int [] marks = new int[5];
        for(int i = 0;i<marks.length;i++){
            System.out.print("Marks of " +(i+1) );
            System.out.print(" Student:");
            marks[i]=s.nextInt();
        }
        int sum=0;
        float avg;
        for(int j = 0 ; j< marks.length; j++){
            sum += marks[j];
        }
        avg = sum/marks.length ;
        System.out.println("Average marks of Students:"+avg);

        //Problem 4
       int [][] matrix1 = new int[2][3];
        int [][] matrix2 = new int[2][3];

        for(int i = 0;i<=1 ; i++){
            for(int j = 0;j<=2 ; j++){
                System.out.printf("Input Matrix1 %d,%d = ", i+1,j+1);
                matrix1[i][j] = s.nextInt();
                System.out.printf("Input Matrix2 %d,%d = ", i+1,j+1);
                matrix2[i][j] = s.nextInt();
            }
        }
        // add two matrix
        int [][] finalmatrix = new int[2][3];
        for(int n = 0; n<=1 ; n++){
        for(int m = 0; m<=2 ; m++){
            finalmatrix[n][m] = matrix1[n][m] + matrix2[n][m];
            System.out.printf("%d,%d element = %d\n",n+1,m+1,finalmatrix[n][m]);
        }
        }


    //Problem 5
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int [] array = new int[n];
        for(int i = 0 ; i < array.length ;i++){
            array[i] = sc.nextInt();
        }
        int a  ;

       for(int j = 0 ; j< array.length/2  ; j++) {
           a = array[j];
           array[j] = array[n - j - 1];
           array[n - j - 1] = a;
       }
          for(int k = 0 ; k < array.length  ; k++){
              System.out.println(array[k]);
              }

    // Problem 6

    int [] array = new int[5];
        int a = 0;
        for(int i=0; i< array.length ; i++){
            array[i]=s.nextInt();
        }

        for(int j = 0 ; j< array.length ; j++) {
            if (array[0] < array[j] ) {
                    array[0]= array[j];
            }
        }
        System.out.println("largest="+array[0]);



    //Problem 7
       int [] array = new int[5];
        for(int i = 0 ; i < array.length ; i++){
            array[i]=s.nextInt();
        }
        for(int j = 0 ; j< array.length ; j ++){
            if(array[0]>array[j]){
                array[0]= array[j];
            }
        }
        System.out.println("smallest= "+array[0]);








    }
}
