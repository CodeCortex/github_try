package com.company;


// this program is used to run the loop and break the loop using for loop

public class java_break_loops {
    public static void main(String[] args) {

        /*
        for(int a=0; a<5; a++){
            System.out.println(a);
            System.out.println("I am doing java");
            if(a==3){
              //  System.out.println("this is the end of your loop");
                break;
            }
        }

         */


        // same program using do.. while  loop
        /*
        int a;
        a=1;
        do{

            System.out.println("i am doing java");
            if(a==4) {
                break;
            }

                a++;


        }while(a<5);

         */

// this program also works together using while loop

        int a;
        a=1;
        while(a<5){
            System.out.println("i am doing java");
            if(a==4) {
                break;
            }

            a++;


        }




    }

}
