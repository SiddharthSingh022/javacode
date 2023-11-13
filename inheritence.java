class base{
    int x;
    int y;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("javsfjvh");
    }
}
class derived extends base{
    int y;
    int gety(){
        return y;
    }
    public void stey(int y){
        this.y=y;
    }
}
public class inheritence {
    public static void main(String[]args){
        base b=new base();
        int v=34;
        b.setx(v);
        System.out.println(b.getx());
        derived d=new derived();
        d.stey(v);
        System.out.println(d.gety());

    }
}
