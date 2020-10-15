package MultiThreading;

public class SynchronizedExample {
    public static void main(String[] args){
        final Customer customer = new Customer();
        new Thread(){
            public void run(){
                customer.withdraw(1500);
            }
        }.start();

        new Thread(){
            public void run(){
                customer.deposit(1000);
            }
        }.start();
        new Thread(){
            public void run(){
                customer.deposit(1000);
            }
        }.start();
    }
}
