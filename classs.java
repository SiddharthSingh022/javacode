import java.util.Scanner;
class classs{
    
    int mul(int a,int b){
    return a+b;
}
double mul(double a,double b,double c){
    return a*b;

}
public static void main(String[]args){
    // Scanner sc=new Scanner{System.in};
    classs obj=new classs(); 
    int c=obj.mul(5, 6);
    double d=obj.mul(4, 3,5);
    System.out.println("multiple method :returns integer:"+c);
    System.out.println("multiple method :returns integer:"+d);
}
}