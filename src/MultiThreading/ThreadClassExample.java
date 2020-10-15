package MultiThreading;

public class ThreadClassExample extends Thread{
    public static void main(String[] args){
        ThreadClassExample thread = new ThreadClassExample();
        System.out.println("Thread Created by Extending Thread Class");
        thread.start();
    }

    public void run(){
        System.out.println("Thread Running....");
        for(int i = 1; i <= 4; i++)
        {
            System.out.print(i +"\t");
        }
    }
}
