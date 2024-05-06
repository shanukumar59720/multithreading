class Example implements Runnable{
    public void run(){

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Focus is Important!");
            Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class threads8 {
    public static void main(String[] args) {
        Example ex= new Example();
        Thread t1 = new Thread(ex);
        t1.start();
        t1.interrupt();

    }
}
