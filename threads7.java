class Demo3 implements Runnable{
    public void run(){
        try{
            for(int i = 0; i<2; i++){
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }
        }
        catch (Exception e) {
            System.out.println("Some error occured");
        }
    }
}

public class threads7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread started!");

        Demo3 dm = new Demo3();

        Thread t1 = new Thread();
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join(); // until t1 is not complete main won't be executed
        System.out.println("Main Thread Finished completely!");
    }
}
