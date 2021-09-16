package com.company;
import java.util.Scanner;

public class java_chapter_1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println(" process of entering your number: ");
        System.out.println(" enter your first number: ");
        int a= sc.nextInt();
        System.out.println(" enter your second number: ");
        int b= sc.nextInt();
        int sum= a +b;
        System.out.print(" the sum of your number is: ");
        System.out.println(sum);


    }
}
