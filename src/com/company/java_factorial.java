package com.company;
import java.util.Scanner;

public class java_factorial {
    static int factorial(int a){
        //Scanner sc= new Scanner(System.in);

        //int b=sc.nextInt();
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;


    }

    public static void main(String[] args) {
        int m=5;
        int f=factorial(m);
        System.out.println(" the factorial of given number is: "+f);
    }

}
