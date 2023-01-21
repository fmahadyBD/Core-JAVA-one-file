public class Thread_implements {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread obThread = new Thread(new MyThread());// it is an interface so we
            obThread.start();

            /*
             * MyThread myRunnable = new MyThread();
             * Thread thread = new Thread(myRunnable);
             * thread.start();
             */
            /*
             * it hASE NO constructure beacuse it is an interface
             */

        }

    }

}

class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Yor (implements) Id is:" + Thread.currentThread().getId());
        } catch (Exception e) {
            // we use try beause output without erron. if some how it is not working
            // then it will skip this part

        }

    }

}
