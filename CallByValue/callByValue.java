package midexam;


public class callByValue {
     public static void main(String[] args) {
        Fahim obj=new Fahim(5);
        System.out.println("call 1st: "+obj.a);
        Fahim obj1=obj.in(7);
        System.out.println("call 2nd: "+obj1.a);
        
    }
    
}
class Fahim{
    int a;
    Fahim(int x){
        a=x;
    }
    Fahim in(int z){
        Fahim obj=new Fahim(z+a);
        return obj;

    }
}
/*
output:
call 1st: 5
call 2nd: 12
*/
