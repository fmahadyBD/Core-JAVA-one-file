
    class Task1 implements Runnable {
    public void run() {
        System.out.println("Hi 1");
    }
}

class Task2 implements Runnable {
    public void run() {
      System.out.println("hi 2");
    }
}

public class Multithreads_ 
    

{
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}

