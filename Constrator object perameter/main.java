

public class TimeExaplle {
    public static void main(String[] args) {
        TimeShow obj=new TimeShow();
        obj.disply();
        TimeShow obj2=new TimeShow(10,20,20);
        obj2.disply();
        TimeShow obj3=new TimeShow(10,10,10);
        obj3.disply();
        
    }
}
class TimeShow {
    private double hour;
    private double second;
    private double minute;
     TimeShow(){

        
    }
          public TimeShow(int h,int m,int s){
            hour=h;
            minute=m;
            second=s;
           

    }
    public TimeShow(TimeShow h,TimeShow m,TimeShow s){
        this.hour=h.hour;
        this.second=m.second;
        this.minute=s.minute;
      

    }
    void disply(){
        System.out.println("Hour: "+hour*60*60+" Minute: "+minute*60+" Second: "+second);
    }

}
