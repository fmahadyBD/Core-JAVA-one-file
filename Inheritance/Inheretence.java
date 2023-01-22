public class Inheretence {
    public static void main(String[] args) {

        B objB=new B();
        objB.Name="Mahady Hasan Fahim";
        objB.age=22;
        objB.class_=15;
        objB.display2();
        System.out.println();

        B objB2=new B();
        objB2.Name="Mahady ";
        objB2.age=22;
        objB2.class_=15;
        objB2.display2();
        System.out.println();
        // Perent class
         A obj=new A();
         obj.Name="Faim";
         obj.age=22;
         obj.display();

        
    }
    
}
class A{
    int age;
    String Name;
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age:"+age);
    }
}
class B extends A{
    int class_;
    void display2(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
        System.out.println("Class:"+class_);
    }
}
