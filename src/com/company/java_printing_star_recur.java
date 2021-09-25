package com.company;

public class java_printing_star_recur {
   int star(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

return 0;
    }

    public static void main(String[] args) {
        int a= 5;

        java_printing_star_recur obb= new java_printing_star_recur();
        int call = obb.star(a);

        //System.out.println(" the answer is" +call);
    }
}
