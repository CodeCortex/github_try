package com.company;



// this program is used to print the sum of the two matrix in 2D


public class java_matrix_addition {
    public static void main(String[] args) {

        int [][] amat={{2,3,1},{1,2,3}};
        int [][] bmat={{4,3,2},{5,4,1}};

        int [][] sum= new int[2][3];

        for(int i=0; i<amat.length; i++){
            for( int j=0; j<amat[i].length; j++){
                sum[i][j]=amat[i][j]+bmat[i][j];
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();
        }
    }
}
