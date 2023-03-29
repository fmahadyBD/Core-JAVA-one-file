package overloding;



public class Overloding {
    public static void main(String[] args) {

        Box obj=new Box(2,3,4);
        System.out.println("The Area is   :"+obj.baseArea());
        System.out.println("The Volume is :"+obj.Volume());
        System.out.println();
        Box obj1=new Box(5,6,7);
        System.out.println("The Area is  :"+obj1.baseArea());
        System.out.println("The Volume is:"+obj1.Volume());
        System.out.println();
        Box obj2=new Box(10,11,12);
        System.out.println("The Area is   :"+obj2.baseArea());
        System.out.println("The Volume is :"+obj2.Volume());
        System.out.println();

        System.out.println("The overloading :"+obj2.Volume(4));
    }
}

public class Box {

    int l;
    int w;
    int h;

    // this is the class's propartics
    Box(int l,int w,int h){
        //this is varriable
        this.l=l;
        this.w=w;
        this.h=h;
            /* frist l means the propertices of class ,
            2nd l means the the methos's veriable;


             */

    }
    int baseArea(){
        return h+l+w;
    }
    int Volume(){
        return l*w*h;
    }
    int Volume(int a){
        return a*l;
    }
    protected void finalize(){
        System.out.println("Killing now");
    }
}
