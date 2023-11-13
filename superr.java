class Base1{
    Base1(){
        System.out.println("i am a contructor");
    }
        Base1(int x){
            System.out.println("I am an overloaded contructor with v value of x"+x);
        }
    
}
class Derived1 extends Base1{
Derived1(){
    System.out.println("I am derived class contructor");
}
Derived1(int x,int y){
    super(x);
    System.out.println("I am an overloaded contructor of derived with value of y as:"+ y);
}
}
class childofderived extends Derived1{
    childofderived(){
        System.out.println("I am a child of derived contructor ");
    }
childofderived(int x,int y,int z){
    super(x,y);
    System.out.println("I am overloaded contructor of Derived with z"+z);

}
}

public class superr {
    public static void main(String[]args){
        Base1 b=new Base1();
        Derived1 d= new Derived1(14,7);
        childofderived cd= new childofderived(12,32,21);
        

    }
    
}
