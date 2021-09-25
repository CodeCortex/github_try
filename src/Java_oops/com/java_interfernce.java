package Java_oops.com;

interface Bicycle{
    void applyBrake(int decrement);
    void speedUp( int decrement);
}
interface motorcycle{
    void horn(int h);
    void top(int t);
}


class avoncycle implements Bicycle,motorcycle{   // you can put the extra interface data in the place of motorcycle
  public  void applyBrake(int decrement){         // public is necessary in this command
        System.out.println(" decreasing..........");
    }
    public void speedUp( int decrement){
        System.out.println("increasing............");
    }
    void warmUp(){                             // extra methods can be added
        System.out.println("this is for the extra boost");
    }
    public void horn(int h){
        System.out.println("po po po po ");
    }
    public void top(int t){
        System.out.println(" pe pee pee peee");
    }
}


public class java_interfernce {
    public static void main(String[] args) {
        avoncycle avon= new avoncycle();
        avon.applyBrake(3);
        avon.warmUp();

    }
}
