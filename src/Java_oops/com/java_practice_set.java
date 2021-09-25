package Java_oops.com;


// creating the first class
class employee{
    String name;
    int salary;
    int id;

    public void printdetails(){
        System.out.println(name);
        System.out.println(id);
    }

    public int getsalary(){
        return salary;
    }
}


// creating the another class

class smartphone{
    public void ring(){
        System.out.println("ringing...");
    }

    public void vibrat(){
        System.out.println("vibrating....");
    }
    public void call_friend(){
        System.out.println("calling friend....");

    }
}

// this program is used to print the area and perimeter of square
class Square{
    int side;
   // public Square(int side){
    //    this.side=side;
//    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class java_practice_set {
    public static void main(String[] args) {

/*
        //question number 1
        employee no1=new employee();
        no1.name="Rajan jaiswal";
        no1.id=23;
        no1.salary=1000;

        employee no2=new employee();
        no2.name="Deepak jaiswal";
        no2.id=24;
        no2.salary=2000;

        no1.printdetails();
        System.out.println(no1.getsalary());

        no2.printdetails();
        System.out.println(no2.getsalary());


        //question number 2

        smartphone nokia= new smartphone();
        nokia.ring();
        nokia.vibrat();
        nokia.ring();

 */

        // question numeber 3

        //int a=5;
       Square sc= new Square();
       sc.side=5;
        System.out.println(sc.area());
        System.out.println(sc.perimeter());

    }
}