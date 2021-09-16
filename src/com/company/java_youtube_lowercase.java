package com.company;
import java.util.Locale;
import java.util.Scanner;

public class java_youtube_lowercase {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //problem number 1
        String A = "Roshan is my name";
        System.out.println(A.toUpperCase());

        // problem number 2
        System.out.println(A.replace(" ", "_"));

        // problem number 3
        String letter= "</name/>, thank you very much";
        letter= letter.replace("</name/>","Roshan");
        System.out.println(letter);

        // problem number 4
        String text= "my hobby is playing  basketball";
        System.out.println(text.indexOf("  "));
        System.out.println(text.indexOf("   "));


        // to print the following sentence in the letter format
        String myletter=" Dear Roshan, you have been selected for the contest, Thank you";
        myletter="Dear Roshan,\n\t you have been selected for the contest\n \t Thank you";
        System.out.println(myletter);


    }


}
