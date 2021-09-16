package com.company;
import java.util.Scanner;

//2.5-5------> tax is 5%
//5-10------> tax is 20%
//above 10------> tax is 30%

public class java_tax_calculation {
    public static void main(String[] args) {
        float tax;
        tax=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your income in lakhs: ");
        float income= sc.nextFloat();
        if(income<=2.5f){
            tax= tax+0;
        }
        else if( income>2.5f && income<=5f){
            tax= tax+ 0.05f *(income-2.5f);
        }
        else if(income>5f && income <=10f){
            tax= tax+ 0.05f *(income-2.5f);
            tax= tax+ 0.2f *(income-5f);
        }
        else if(income>5){
            tax= tax+ 0.05f *(income-2.5f);
            tax= tax+ 0.2f *(income-5f);
            tax= tax+ 0.30f *(income-10f);
        }
        System.out.print("your total income after tax reduction: "+ tax);

    }
}
