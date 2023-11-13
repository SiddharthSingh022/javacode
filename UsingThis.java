class ekClass{
    int a;
    public int getA(){
        return a;
    }
    ekClass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekClass{ doclass(int c){ super(c); 
    System.out.println("I am a constructor"); } 
    } 
public class UsingThis {
    public static void main(String[] args) {
        ekClass e =new ekClass(44);
        doclass d= new doclass(5);
        System.out.println(e.getA());

    }
    
}
