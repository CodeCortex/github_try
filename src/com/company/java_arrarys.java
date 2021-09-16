package com.company;

public class java_arrarys {
    public static void main(String[] args) {



        int[]marks= new int[5];
        marks[0]=60;
        marks[1]=65;
        marks[2]=70;
        marks[3]=80;
        marks[4]=90;
        System.out.println(marks[3]);

         // this program is to primt the data reverse order

        for(int i=marks.length-1; i>=0;i--) {
            System.out.println(marks[i]);
        }

        // to print the data in simple order



        for(int a=0; a<marks.length; a++){
            System.out.println(marks[a]);
        }
        System.out.println("\n");

// this is also the same program which is used to print the date in ascending order
        // this is impertant formula.............

        //     for(int element:arrys){
        //          System.out.println(element);
        //     }



        for(int element:marks){
            System.out.println(element);
        }



    }
}
