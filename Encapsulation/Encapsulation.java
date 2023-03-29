
pakage Mahady_hasan_fahim

public class Encapsulation {
    public static void main(String[] args) {
        OfficeEmpo obj=new OfficeEmpo(01,"Fahim",22,222,2);
        prog obj2=new prog(02,"Mahady",23,222,7);
        obj.show();;
        obj2.show();
//        Empo e=new Empo(" ",0,0) {
//            @Override
//            void givesala() {
//
//            }
//        };
        obj.givesala();
        obj2.givesala();
       // System.out.println(obj2.givesala());
        //it will be done when our code is return something;
    }
}


public abstract class Empo  {
   protected String name;
    protected int id,age;
    public Empo(String name,int id,int age)
    {
        this.age=age;
        this.id=id;
        this.name=name;
    }
    public void show(){
        System.out.println("Id"+id+" Name:"+" Age:"+age);
    }
   public abstract void givesala();
}


public class OfficeEmpo extends Empo{
   private double salary;
  private  double hours;

    public OfficeEmpo(int id, String name,  int age,double salary,double hours ){
        super(name, id, age);
        //supper () means calling the parent class's constrator.
        this.hours=hours;
        this.salary=salary;
    }
    public void show(){
        super.show();
       // System.out.println("Selary:"+salary+" Hours: "+hours);
        System.out.println(" Hours: "+hours);
    }
    public  void givesala(){
        System.out.println("Selary "+salary);
    }
}

public class prog extends Empo{
    private int cost;
    private int deadline;
   public prog(int id, String name, int age,int cost,int deadline) {
        super(name, id, age);
        this.cost=cost;
        this.deadline=deadline;
    }
    public void show(){
        super.show();
        System.out.println("Cost:"+cost+" Dadline: " +deadline);
    }
    public void givesala(){
        System.out.println("Pro selary: "+cost/deadline*30);
    }
}











