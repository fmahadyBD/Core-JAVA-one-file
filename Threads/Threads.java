// using Thead class

/*Java threads are a way to run multiple parts of a program in parallel.
WE CAN use the core in a useful way. it will print in diffrent sreial
 * 
 */
public class Threads {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // new MyThread(i);
            MyThread objMyThread = new MyThread(i);
            objMyThread.start();// To infrom our jdbc it is a thread

        }
    }
}

class MyThread extends Thread {

    int id;

    public MyThread(int id) {
        this.id = id;
    }

    public void run() {
        try {
            System.out.println("Yor (Class) Id is:" + id);// it has get id but we use id in here
        } catch (Exception e) {
            // we use try beause output without erron. if some how it is not working
            // then it will skip this part

        }

    }

}