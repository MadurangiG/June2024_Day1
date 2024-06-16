package multithreading;

public class BankAccount {
    private String accName;
    private int amount;

    public BankAccount(String accName) {
        this.accName = accName;
    }

    public synchronized void depositMoney(int depositAmount){
        amount+=depositAmount;
        System.out.println(Thread.currentThread().getName()+" deposited amount "+ depositAmount + " to " + accName);
        System.out.println("Current balance of "+accName+" is " + amount);

    }
}
