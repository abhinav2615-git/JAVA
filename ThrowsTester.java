class NegativeAmountException extends Exception{
    public NegativeAmountException(String message) {
        super(message);
    }
}


class ATM{
    private int balance = 5000;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amt) throws Exception{
        System.out.println("deposit:"+ amt);
        if(amt<0)
            throw new Exception("Negative amount is not valid to deposit");
        balance += amt;

    }
    public void withdraw(int amt)throws Exception{
        System.out.println("withdraw:"+ amt);
        if(amt>balance)
            throw new Exception("Insufficient balance");

        else
        balance -= amt;
    }
}
public class Throwstester {
    public static void main(String[] args) {
        try {
            ATM a1 = new ATM();
            System.out.println("Balance: " +a1.getBalance());
            a1.deposit(2000);
            System.out.println("Balance: " +a1.getBalance());
            a1.withdraw(2500);
             System.out.println("Balance: " +a1.getBalance());
            
        }catch (NegativeAmountException ex){
            System.out.println(ex.getMessage());
        }
        
        
         catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Transaction completed");
        }
    }
}