package com.company;
import java.util.Scanner;

public class Java_sum {
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else
        {
            return n+ sum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter a number to which you want to print the sum of n: ");
        int a=sc.nextInt();
        System.out.println("the required answer is: " +sum(a));


    }
}
