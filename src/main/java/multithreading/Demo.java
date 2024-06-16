package multithreading;

public class Demo {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("account 01");
        BankAccount bankAccount2 = new BankAccount("account 02");

        DepositedThread t1 = new DepositedThread(bankAccount1);
        DepositedThread t2 = new DepositedThread(bankAccount2);

        DepositedRunnable r1 = new DepositedRunnable(bankAccount1);
        DepositedRunnable r2 = new DepositedRunnable(bankAccount2);

        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
