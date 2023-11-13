import java.util.Scanner;
public class static_factorial{
    static int factorial(int n){
        if(n==0||n==1){
            return 1;

        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_interative(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int product =1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }

    }
//}
public static void main(String[]args){
    Scanner sc =new Scanner (System.in);
    System.out.println("enter the value of integer");
    int x=sc.nextInt();
   System.out.println("the value of factorial x is "+factorial(x));
   System.out.println("the value of factorial x is "+factorial_interative(x));
}
}