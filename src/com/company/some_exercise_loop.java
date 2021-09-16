package com.company;
import java.util.Scanner;


// this is a program which take input and print the table of that input


public class some_exercise_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number which you want to print table: ");
        int num= sc.nextInt();


        /*for(int a=1; a<=10;a++){
            System.out.printf("%d x %d =%d\n", num,a,num*a);
        }

         */


        // to print the table of given input in reverse order

        /*
        System.out.printf("the table of %d\n\n\n",num);
        for(int b=10; b>=1;b--){

            System.out.printf("%d * %d= %d\n",num,b,num*b);
        }

         */

        // to print the factorial of given number

        int fact=1;
        for(int f=num; num>=1;num--){
          //  fact=fact*num;       //-----> this can be also used in the same prpgram
            fact*=num;
        }
        System.out.println("the required factorail is "+fact);



    }
}
