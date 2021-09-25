package com.company;
import java.util.Scanner;


// this program is used to print the nth of fibonacci numbner
// the actual number start from the     0 ,1, 1, 2, 3, 5, 8, 13, 21, …,

public class java_fibonacci {
    static int fib(int n){
        if (n==1){              //
            return 0;           //
        }                       // this all line can replace by
        else if(n==2){          // if(n==1||n==2){
                                // return n-1;
            return 1;           //
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your term you want to print: ");
        int a= sc.nextInt();
        System.out.println("the requried the fabonacci is :"+ fib(a));
    }
}
