package com.company;

public class Java_facotrial_real{
    static int fac(int a){

        if (a==0||a==1){
            return 1;
        }
        else
        {
            return a* fac(a-1);
        }

    }

    public static void main(String[] args) {
        int a=7;
        System.out.println(" the factorial number of" +a+ "is:"+ fac(a));
    }



        }
