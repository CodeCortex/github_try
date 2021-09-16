package com.company;


import org.w3c.dom.ls.LSOutput;

public class java_without_function {
    int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else
        {
            z=y-x;
        }
        return z;

    }


    public static void main(String[] args) {
        int a= 7;
        int b= 9;
        int cal;

        // we need to declare the object when we don't use the static function

        java_without_function obb=new java_without_function();
        cal= obb.logic (a,b);

        int r=8;
        int s=2;
        int opt;

        opt= obb.logic(r,s);
        System.out.println(cal);
        System.out.println(opt);

    }

}
