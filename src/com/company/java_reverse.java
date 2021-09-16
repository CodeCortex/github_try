package com.company;

public class java_reverse {
    public static void main(String[] args) {


        int [] number={1,2,3,4,5,6,7,8};

        /*
        int[] duplicate = new int[number.length];
        for(int a=0; a<number.length;a++){
            int oneLessThaLength=number.length-1;
            duplicate[a]= number[oneLessThaLength-a];
            System.out.print( duplicate[a]);

        }

         */


// this is an another method to reverse the integer


         int c=0;
         for(int i=0;i<(number.length)/2;i++){
             c= number[i];
             number[i]= number[number.length-1-i];
             number[number.length-1-i]=c;


        }

        for(int element:number){
            System.out.println(element);
        }
    }

}
