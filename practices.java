import java.util.Scanner;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
        void setTitle(String s){
            title=s;
        }
    }

public class practices{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook obj=new MyBook();
        obj.setTitle(title);
        obj.getTitle();
        System.out.println(obj.getTitle());
    }
}