class Demo2 implements Runnable{
    public void run(){
        System.out.println("Child thread executing");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Some problem occured!");
        }
        System.out.println("Child thread task completed");
    }
}

public class threads6 {
    public static void main(String[] args) {
        System.out.println("Main Thread started!");
        Demo2 d= new Demo2();
        Thread t1 = new Thread(d);
        
        t1.start(); // runnable state
    }
}
