import java.util.Scanner;

// creating threads by extending thread class
class MyThread1 extends Thread{
    public void run(){
      String tName = Thread.currentThread().getName();  
      if((tName.equals("Calc"))){
        calc();
      }
      else{
        importantMsg();
      }
    }
    public void calc(){
        System.out.println("Calculation task started!");

        Scanner sc = new Scanner(System.in);
        System.out.print("PLease enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println("The sum of two numbers is - "+result);
        System.out.println("Calculation task ended!");
        System.out.println("*****************************");
        sc.close();
    }
    public void importantMsg(){
        System.out.println("Displaying important message task!");
        try {
            for (int i = 0; i <3; i++) {
                System.out.println("Focus is important to master skills");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Some problem occured");
        }
        System.out.println("Displaying important message task ended");
    }
}



public class threads5 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        
        thread1.setName("Calc");
        thread1.setName("Print");
        thread1.start();;
        thread2.start();
        
    }
}
