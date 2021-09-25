package Java_oops.com;
import java.util.Random;                    // this program doesn't provide the required answer.
import java.util.Scanner;

class game {
    public int getRandom(int max, int min) {
        return( int)((Math.random() * (max - min)) + min);
    }
}




public class java_guess_the_number {
    public static void main(String[] args) {
       int max=20;
       int  min=0;

        // guess the number between 1 to 20;
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
         //random.game();
        int comguess= random.nextInt();

        for (int i=0;i<10;i++) {

            System.out.print("Enter your  guess number: ");
            int yourguess = sc.nextInt();


            if (yourguess == comguess) {
                System.out.println("congrat, your guess is matched ");
                break;
            } else if (yourguess > comguess) {
                System.out.println("plz, higher your number");

            } else {
                System.out.println("plz, lower your number");

            }
        }

    }

}
