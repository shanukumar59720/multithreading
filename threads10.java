class Library implements Runnable {
    String res1 = new String("Java");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("STUDENT1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student1 has acquired resource 1 " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student 1 has acquired resource 2 " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student 1 has acquired resource 3 " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some problem occured");
            }

        } else {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student2 has acquired resource 1 " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student 2 has acquired resource 2 " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student 2 has acquired resource 3 " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some problem occured!");
            }

        }

    }
}

public class threads10 {
    public static void main(String[] args) {
        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("STUDENT1");
        t2.setName("STUDENT2");

        t1.start();
        t2.start();
    }

}
