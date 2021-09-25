package Java_oops.com;
abstract class pen{
   abstract void write();
   abstract void refill();
}

class fountainpen extends pen{
    void write(){
        System.out.println("writing.....");
    }
    void refill(){
        System.out.println("refilling.......");
    }

    void changeNib(){
        System.out.println("changing the nib......");
    }
}
class monkey{
    void jump() {
        System.out.println("jumping....");
    }
    void bite(){
        System.out.println("biting.....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("speaking....");
    }
    @Override
    public void eat(){
        System.out.println(" eating.......");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping........");
    }
}

public class java_abstract {
    public static void main(String[] args) {
        //q1+q2
        fountainpen pen= new fountainpen();
        pen.changeNib();

        //q3
        human hum= new human();
        hum.sleep();


        monkey m1= new human();
        //m1.speak;  --> this can't use fot human ,here monkey is in only use
        m1.jump();   // so only the code of monkey is used

    }
}
