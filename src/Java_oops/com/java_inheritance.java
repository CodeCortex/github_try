package Java_oops.com;
class base1{

     base1(){
        System.out.println(" this is my first base1");

    }

    base1(int x){
        System.out.println("this is my first base1 with argument "+x);
    }
}

class derived1 extends base1{

     derived1() {
         System.out.println(" this is my first derived1 ");
    }
    derived1(int x, int y){
         super(x);             // this code is used to print the data that contain argument otherwise the default will be printed.
        System.out.println("this is my first base2 with an argument  "+y);
    }
}

class derived2 extends derived1{
    derived2(){
        System.out.println(" this is my second derived ");
    }
    derived2(int x,int y, int z){
        super(x,y);
        System.out.println(" this is my second derived2 with an argument "+z);
    }
}


public class java_inheritance {
    public static void main(String[] args) {
       // base1 bas= new base1();
      // base1 ba= new base1(2);

      //  derived1 dev= new derived1(4,3);

        derived2 d= new derived2(9,8,7);

    }

}
