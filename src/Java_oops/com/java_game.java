package Java_oops.com;
import java.util.Scanner;
import java.util.Random;

class gameofnum{                    // this program is not good. it needs correction.
   // int max;
   //int min;
    int input;
    int cominput;

    Random random= new Random();
    Scanner sc= new Scanner(System.in);
    //private int a;
    //private int n;


    public int getrandom(int max, int min){
        return random.nextInt(max-min)+min;
    }
    void print(String message){
        System.out.println(message);
    }
   // public void setRandom(int n){
     //   this.n= cominput;
   // }
    public int getInput(){
        return input;
    }
    //public void setInput(int a){
    //    this.a= input;
    //}

    public void set(){
        cominput = getrandom(20,1);
        for(int i=0;i<5;i++){
            print("Enter your guess: ");
            int input=sc.nextInt();
            if(input > 0 && input <=20) {
                if (input == cominput) {
                    System.out.println("your guess number is matched");
                    break;
                } else if (input < cominput) {
                    System.out.println("higher your number ");
                } else if (input > cominput) {
                    System.out.println(" lower your number ");
                }
            }
            else{
                i-=1;
                System.out.println(" enter the number between 1 to 20:");
            }


        }

    }

}

public class java_game {
    public static void main(String[] args) {

        gameofnum entry= new gameofnum();
      //  entry.getrandom(20,1);
        entry.set();
    }
}
