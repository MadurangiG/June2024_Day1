package multithreading;

public class DepositedThread extends Thread{
    private BankAccount bankAccount;
    public DepositedThread(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            bankAccount.depositMoney(100);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
