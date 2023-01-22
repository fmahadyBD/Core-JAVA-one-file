public class Exception_throws {
    public static void main(String[] args) throws Exception{
    // we report to JVM for this exeptions, So it can manage easlynow
        for(int i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        
    }
    
}
