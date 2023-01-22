public class Try_catch_Finally {
    public static void main(String[] args) {
        
        try{
            int a=0;
            int b=100;
            int result=b/a;
            System.out.println("the result:"+result);
        }catch(ArrayIndexOutOfBoundsException e){// it is ArithmeticException but we done a mistake. 
            System.out.println("Exception: "+e);
        }catch(Exception all_of_Exception_class_in_There){
            System.out.println("The Name of Exceptions is:"+all_of_Exception_class_in_There);
            //It can use in any where. After it sing anythigs will value less
        }
        
        finally{
            System.out.println("This is finally block");
            //what will happpen finally will run
        }


    }
}
