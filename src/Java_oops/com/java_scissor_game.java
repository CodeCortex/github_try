package Java_oops.com;
import java.util.Scanner;
import java.util.Random;

public class java_scissor_game {
    public static void main(String[] args) {
       // 0 means rock
        // 1 means paper
        // 2 means scissor
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter any number from 1 to 3");
        System.out.println(" 0 equals to rock\n 1 means paper\n 2 means scissor");
        int userinput=sc.nextInt();

        Random random= new Random();
        int compinput= random.nextInt(3);
       // System.out.println(compinput);   ---> this line is used to print the computer decision

        if(userinput==compinput){
            System.out.println("draw! try again");
        }
        else if(userinput==0 && compinput==2|| userinput==1 && compinput==0|| userinput==2 && compinput==1){
            System.out.println("congrats! you win");
        }
        else{
            System.out.println(" sorry! you fail");
        }
    }
}
