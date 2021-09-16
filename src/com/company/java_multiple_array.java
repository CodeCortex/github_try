package com.company;

public class java_multiple_array {
    public static void main(String[] args) {
        int []road;   // this is 1 D array
        int [][]house_no;     // this is a 2D array
        house_no= new int [2][3];
        house_no[0][0]=101;
        house_no[0][1]=102;
        house_no[0][2]=103;

        house_no[1][1]=105;
        house_no[1][2]=106;



        for(int a=0;a<house_no.length;a++) {
            for(int j=0;j<house_no[a].length;j++) {
                System.out.println(house_no[a][j]);


            }

        }

    }
}
