class MymainEmployee{
    private int id;
    private String name;
    public MymainEmployee(){
        id=0;
        name="Your Name here";
    }
    public MymainEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public MymainEmployee(String myName){
        id=1;
        name=myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class constructor{
    public static void main(String[]args){
        MymainEmployee singh=new MymainEmployee("programming with singh");
      //  String an;
        System.out.println("Enter your sname");
        singh.setName("siddharth");
        singh.setId(34);
        System.out.println(singh.getId());
        System.out.println(singh.getName());

    }
}
