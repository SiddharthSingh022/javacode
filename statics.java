import java.util.Scanner;
class statics{
    static int add(int ...arr){
        int result =0;
        for (int a:arr) {
            result=result+a;
        }
        return result;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
        System.out.println("answer\n\n");
        System.out.println(add(a,b));
        System.out.println(add(a,b,c));
    }
   
}
