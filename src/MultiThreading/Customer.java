package MultiThreading;

public class Customer {
    int amount = 1000;
    synchronized void withdraw(int amount){
        System.out.println("Available Balance : " + this.amount);
        System.out.println("Withdraw Amount : " + amount);
        if(this.amount < amount){
            System.out.println("Insufficient Balance waiting for deposit.");
            try {
                wait();
            }catch (Exception e){
                System.out.println("Interruption Occurred.");
            }
        }
        this.amount -= amount;
        System.out.println("Detected Amount : " + amount);
        System.out.println("Available balance : " + this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("Going to Deposit : " + amount);
        this.amount = this.amount + amount;
        System.out.println("Available Balance : "+ this.amount);
        System.out.println("Transaction Completed. \n");
        notify();
    }
}
