package com.company;
import java.util.Scanner;

public class java_name {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YOUR NAME AND ADDRESS:");
        String FIRST=sc.next();
        System.out.println(FIRST);
        String des= sc.nextLine();
       // System.out.println(FIRST);
        System.out.println(FIRST+des);

    }
}
