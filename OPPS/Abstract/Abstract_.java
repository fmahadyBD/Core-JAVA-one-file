public class Abstract_ {

    public static void main(String[] args) {
        a1 refVe;// Suber class don't need make objects, It need a Refarencee Veriable
        
        refVe=new A();
        refVe.abs();
        refVe=new B();
        refVe.abs();
    }
    
}
abstract class a1{

    int id;
    int number;
    abstract void abs();
}

class A extends a1{

    @Override
    void abs() {
        // TODO Auto-generated method stub
        System.out.println("Hi from A");
        
    }
    
}
class B extends a1{

    @Override
    void abs() {
       System.out.println("Hi from B");
        
    }
    

}
