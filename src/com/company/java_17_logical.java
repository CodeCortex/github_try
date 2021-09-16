package com.company;
import java.util.Scanner;

public class java_17_logical {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // to take multiple choice and give result

        /////// this is not the correct form to print this program. case intake only fixed value not the interval


       /* System.out.println("enter your marks: ");
        int a= sc.nextInt();
        switch(a){
            case 90:
                System.out.println("congratulation, you scored A+");
                break;
            case 80:
                System.out.println("well done, you scored A");
                break;
            case 60:
                System.out.println("good, you scored b+");
                break;
            case 40:
                System.out.println(" you are passed");
                break;
            default:
                System.out.println("sorry, try next year");
        }
*/
        System.out.print("Enter the number of day: ");
        int day= sc.nextInt();
        switch(day){
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("saturday");

        }

    }
}
