package com.company;

public class java_varargs {

   /* static int sum(int a,int b) {

        return a+b;
    }
    static int  sum(int a,int b,int c){
        return a+b+c;
        }
    */

    // in this process we need to make more static functional function,so we use varargs

    static int sum(int ...arr){           // this process is used to input numerous input
        int result =0;              //varargs means triple dot --> ...
        for(int a:arr){
            result+=a;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is: " +sum(4 ,5));
        System.out.println("the sum of 4, 5 and 9 is: " +sum(4,5,9));
        System.out.println(" the sum of 1,2,3,4,5,6,7,8,,9 is :"+sum(1,2,3,4,5,6,7,8,9));


    }





}
