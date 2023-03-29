
package midexam;

public class ReturnObj {
    public static void main(String[] args) {
        HowToReturnObject obj1=new  HowToReturnObject(5);
         HowToReturnObject obj2=obj1.incrByValue(10);
         System.out.println(obj2.a);
         obj2=obj2.incrByValue(15);
         System.out.println(obj2.a);
                 
        
    }
    
}
class  HowToReturnObject{
    int a;
     HowToReturnObject(int i){
         a=i;
     }
      HowToReturnObject incrByValue( int i){
      HowToReturnObject temp=new  HowToReturnObject(a+i);
      return temp;
}
}
/*
output:
15
30
*/
