package Java_oops.com;

//setting of the class
class student {
    int id;
    String address;
    int fees;
    String name;
    String school;

    public void printdetails(){
        System.out.println("STUDENT ID NO." +id);
        System.out.println("STUDENT NAME IS: "+name);
    }
    public int getfees(){
        return fees;
    }
    public String getaddress(){
        return address;
    }

}

public class Java_students {
    public static void main(String[] args) {
        System.out.println(" ALL THE DETAILS OF STUDENTS:: ");
        System.out.println();

        // setting the attributes of Rajan
        student rajan= new student();
        rajan.id=1;
        rajan.name="Rajan jaiswal";
        rajan.address=" katahariya";
        rajan.fees=13;


        //setting the attributes of jyoti
        student jyoti= new student();
        jyoti.id=2;
        jyoti.name="jyoti jaiswal";
        jyoti.address=" katahariya";
        jyoti.fees=10;

        // printing the attributes
        rajan.printdetails();
        System.out.println("fees of rajan "+ rajan.getfees());

        System.out.println("the address of "+rajan.name +" is: "+ rajan.getaddress());

        System.out.println();    // this line program creates the line space
        System.out.println();    //

        jyoti.printdetails();
        System.out.println("fees of jyoti "+jyoti.getfees());
        System.out.println("the address of "+jyoti.name +" is: "+ jyoti.getaddress());

    }

}
