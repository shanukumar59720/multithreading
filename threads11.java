class Queue {
    int x;
    boolean valueInX = false;

    synchronized void put(int j) {
        try {
            if (valueInX == true) {
                wait();
            } else {
                x = j;
                System.out.println("I haved produced the data into x " + x);
                valueInX = true;
                notify();
            }

        } catch (Exception e) {
            System.out.println("Some problem occured");
        }

    }

    synchronized void get() {
        try {
            if (valueInX == false) {
                wait();
            } else {
                System.out.println("I have consumed the data x " + x);
                valueInX =false;
                notify();
            }

        } catch (Exception e) {
            System.out.println("Problem Occured");
        }

    }
}

class Producer extends Thread {
    Queue q;

    Producer(Queue b) {
        q = b;
    }

    public void run() {
        int i = 1;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer extends Thread {
    Queue q;

    Consumer(Queue a) {
        q = a;
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class threads11 {
    public static void main(String[] args) {
        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}