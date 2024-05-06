public class mainThread {

    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("The name of the thread is " +name);
        System.out.println(Thread.currentThread().getPriority());

        Thread t= Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("After changing");
        System.out.println("The name of the thread is " +name);
        System.out.println(Thread.currentThread().getPriority());
        

    }
}