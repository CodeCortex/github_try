package com.company;

public class java_maxnum_array {
    public static void main(String[] args) {
        int []arr={22,24,55,67,89,07};
        int max=0;
        for(int element:arr) {
            if (element > max) {
                max=element;
            }

            //System.out.println(" the maximum value of array is: "+ max);  --> this command run in loop
        }

        System.out.println(" the maximum value of array is: "+ max);
    }
}
