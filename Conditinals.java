import java.util.Scanner;

public class Conditinals {
    public static void main(String[] args) {
        // question 2

        System.out.println("Marks in 1st subject");
        Scanner s= new Scanner(System.in);
        int m1=s.nextInt();
        System.out.println("Marks in 2nd subject");
        int m2=s.nextInt();
        System.out.println("Marks in 3rd subject");
        int m3=s.nextInt();
        float totalmarks = (m1+m2+m3)/3.0f;

        if(totalmarks>40 && m1>33 && m2>33 && m3>33){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
        }

        //  Question 3

        System.out.println("Enter your income: ");
        Scanner s = new Scanner(System.in);
        float income=s.nextInt();
        double tax;
        if(income<250000){
            tax = 0 ;
            System.out.println(tax);
        }
        else if(income<500000 && income>250000){
            tax = (income-250000)*0.05;
            System.out.println(tax);
        }
        else if(income<1000000 && income>500000){
            tax = (income-500000)*0.2 + 250000
            System.out.println(tax);
        }
        else{
            tax = (income - 1000000)*0.3 + (income - 1000000 + )
        }

        //  question 4

        System.out.println("Enter any number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        switch(num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            default:
                System.out.println("no");
        }


        // question 5
        System.out.println("Enter any year:");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if(year%4==0) {
            if(year%100==0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year:");
                } else {
                    System.out.println("Not a leap year:");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year ");
        }



        // question 6
        System.out.println("Write a website:");
        Scanner s = new Scanner(System.in);
        String website = s.next();

        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organisational Webite");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Data not found");
        }



    }
}
