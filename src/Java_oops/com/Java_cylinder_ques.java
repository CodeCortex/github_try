package Java_oops.com;
class Cylinder{
    private int  radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int a){
        this.radius=a;
        System.out.println(" the radius is: "+ a);
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        this.height=h;
        System.out.println("the height is:"+h);
    }
}

public class Java_cylinder_ques {
    public static void main(String[] args) {
        Cylinder cy= new Cylinder();
        cy.setHeight(56);
        cy.setRadius(7);

    }
}

