class Car implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
            Thread.sleep(2000);

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Found car and got into it");
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName() + " Started to drive!");
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getName() + " came back and park!");
                Thread.sleep(2000);

            }

        } catch (Exception e) {
            System.out.println("Some problem occured!");
        }
    }
}

public class threads9 {
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Arpit");
        t2.setName("Sameer");
        t3.setName("Bachha");

        t1.start();
        t2.start();
        t3.start();

    }
}
