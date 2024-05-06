import java.util.Scanner;

// creating threads by extending thread class
class Calc1 implements Runnable {
    public void run() {
        System.out.println("Calculation task started!");

        Scanner sc = new Scanner(System.in);
        System.out.print("PLease enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("The sum of two numbers is - " + result);
        System.out.println("Calculation task ended!");
        System.out.println("*****************************");
        sc.close();
    }
}

class Message1 implements Runnable {
    public void run() {
        System.out.println("Displaying important message task!");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some problem occured");
        }
        System.out.println("Displaying important message task ended");
    }
}

public class threads4 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Calc1 c1 = new Calc1();
        Message1 m2 = new Message1();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);


        t1.start();
        t2.start();
    }
}
