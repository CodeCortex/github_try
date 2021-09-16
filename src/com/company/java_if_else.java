package com.company;
import java.util.Scanner;

public class java_if_else {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // to check whether you can drive or not
        System.out.print("enter your age: ");
        int a = sc.nextInt();
        /*
        if(a>=18) {
            System.out.println("yes, you can drive");
        } else{
                System.out.println("sorry, you cann't drive");
            }

         */



        // another way by using boolean
        boolean m= (a>=18);
        if(m){
            System.out.println("yes, ypou can drive");
        }
        else{
            System.out.println("No,you cann't drive");
        }







        }

    }

