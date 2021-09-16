package com.company;
import java.util.Scanner;

public class java_chapter_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your first marks: ");
        float a= sc.nextFloat();
        System.out.println(" enter your second marks: ");
        float b= sc.nextFloat();
        System.out.println(" enter your first marks: ");
        float c= sc.nextFloat();
        System.out.println(" enter your second marks: ");
        float d= sc.nextFloat();
        System.out.println(" enter your second marks: ");
        float e= sc.nextFloat();
        double T=(a+b+c+d+e)/500*(100);
        System.out.println("your percentage is "+T);
       // System.out.println(T);


    }

}
