package com.company;

public class java_array_exercise {
    public static void main(String[] args) {
        // System.out.println("enter a number of digit: ");

        /*
        float[] marks= {88.8f, 22.2f, 4.5f,7.6f,6.7f};
        float sum=0;
        for(int i=0;i<=4;i++){
            sum+=marks[i];
        }
        System.out.println("the sum of the given number is"+sum);


         */


// this is another way to do the same program
        /*
        float[] marks= {88.8f, 22.2f, 4.5f,7.6f,6.7f};
        float sum=0;
        for(float element:marks){
            sum+=element;
        }
        System.out.println("the sum of the given number is\n"+sum);

         */




        // question: to check whether the given number is in the array or not

        /*
        double[] number = {12, 17.2, 19.3, 113, 7, 9.2};
        double num = 8;
        boolean inthearray = false;
        for (double element : number) {
            if (num == element) {
                inthearray = true;
                break;

            }

        }
        if (true) {
            System.out.println(" the given number is in the array");
        } else {
            System.out.println(" the given number is not in the array");

          }

         */



        // question: this program is used to add the two matrix in 2D
        // this question is hard also

        int [][]matrix1={{1, 2, 3},
                         {4, 5, 6}};

        int [][] matrix2={{2, 3, 4},
                          {5, 6, 7}};

        int [][] result= {{0, 0, 0},
                          {0, 0, 0}};

        for(int i=0; i<matrix1.length; i++) {
            for (int j = 0; j< matrix1[i].length; j++) {
//
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]+" ");


            }
            System.out.println();
        }










   }
}
