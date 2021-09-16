package com.company;

public class java_continue {
    public static void main(String[] args) {

        for (int a = 0; a < 5; a++) {
            if (a == 3) {
                System.out.println(" YOUR ARE IN THIRD STEP");
                continue;
            }
            System.out.println(a);
            System.out.println(" java is great");
        }
    }
}
