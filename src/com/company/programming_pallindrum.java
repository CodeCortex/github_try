package com.company;
import java.util.Scanner;

public class programming_pallindrum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your word: ");
        String nam=sc.next();
        String[] inverse_nam= new String[nam.length()];
        String inversed_name="";

        for(int i = nam.length()-1 ; i>=0 ; i--)
        {
            int inverse_number = nam.length()-1;
            char character = nam.charAt(inverse_number-i);
            inverse_nam[i]=String.valueOf(character);


        }

        inversed_name=String.join("",inverse_nam);
        System.out.println(inversed_name);

        if(nam.equals(inversed_name)){
            System.out.println(" the given name is pallidum");
        }
        else{
            System.out.println(" the given name is not the pallidum");
        }



//        for(int j = 0 ; j<nam.length();j++)
//        {
//            System.out.println(inverse_nam[j]);
//
//        }

//
    }
}
