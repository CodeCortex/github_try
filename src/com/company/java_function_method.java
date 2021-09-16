package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;

public class java_function_method {
    static int logic(int x, int y){
        int z;
        if(x>y) {
            z = x + y;
        }
        else{
            z= y-x;

        }
        return z;

    }




    public static void main(String[] args) {
        int c;
        int a= 4;
        int b=7;
        c= logic(a,b);

        int p= 9;
        int q= 5;
        int m;
        m= logic(p,q);

        System.out.println(c);
        System.out.println(m);
    }


}
