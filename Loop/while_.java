public class while_ {
    public static void main(String[] args) {
        int d=100;
        int c;
      
            c=fx(d);
            System.out.println(c);
         
           
        
        System.out.println(c);
    }
 static int counter=0;
  public static int fx(int d){
    
    while(d!=0){

        fx(d/2);
       counter++;
    }

    return counter;

    }
    
    
}
