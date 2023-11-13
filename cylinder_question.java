class Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radius,int height){
       this.radius=radius;
       this.height=height; 

    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius+2*Math.PI*radius*height;
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class cylinder_question{
    public static void main(String[]args){
        cylinder_question mycylinder=new cylinder_question(9,12);
        //problem 1;
        mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
        mycylinder.setRadius(5);
        System.out.println(mycylinder.getRadius());
        //problem 2;
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
        //problem 3;
        Rectangle r=new Rectangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


    }
}