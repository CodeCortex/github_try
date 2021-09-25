package Java_oops.com;
class Employee{
    private String name;
    private int id;

    public String getName(){
        return name;
    }
    public void setName(String nam){
        this.name=nam;
    }

    public int getId(){
        return id;
    }
    public void setId(int n){
        this.id= n;
    }

}

public class java_private {
    public static void main(String[] args) {
        Employee roshan= new Employee();
        roshan.setName("Roshan jaiswal");
        System.out.println(roshan.getName());

        roshan.setId(34);
        System.out.println(roshan.getId());
    }

}
