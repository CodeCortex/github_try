package com.company;

//to print the following pattern     *****
//                                   ****
//                                   ***
//                                   **
//                                   *
public class java_starprint {
    public static void main(String[] args) {

            for(int c=4;c>=0;c--){
                for (int i=0;i<=c;i++) {
                    System.out.print("*");

                }
                System.out.print("\n"); // ----> we didn't use the println because it will be redundant and create two space
            }
       // }
    }
}
