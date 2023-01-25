class out{
    int x=1;
    class in{
        int y=2;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        out objOut =new out();

        out.in objin=objOut. new in();
        System.out.println("The outer:"+objOut.x);
        // finding the value of x from the outer class;
        System.out.println("Inner:"+objin.y);

        
    }
    
}
