package MultiThreading;

public class RunnableExample {
    public static void main(String[] args){
        System.out.println("Hello");
        Runnable r = new MyThread();
        Thread t = new Thread(r);
        System.out.println("Thread Created !!");
        t.start();
    }
}
class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Running......");
        for(int i = 1; i <= 4; i++)
        {
            System.out.print(i +"\t");
        }
    }
}