 class a{
    void non(){
        System.out.println("Non Static");
    }

    static void staticMathod(){
        System.out.println("Static");

    }
}
//The public type A must be defined in its own fileJava. 

public class StaticMethod {

    public static void main(String[] args) {
        // For the static method, we dont't need to make object .
        // we need to call the static method by using it's class name
        a obA=new A();
        obA.non();
        a.staticMathod();// we directly call by its class name
    }
    
}


