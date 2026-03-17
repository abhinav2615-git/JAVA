class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public int getBalance() {
        return bal;
    }

    public void deposit(String uname, int amt) {
        bal += amt;
        System.out.println("Deposited by " + uname + " of " + amt + ", balance: " + bal);
    }
}

class User extends Thread {
    private Account acc;

    public User(Account acc) {
        this.acc = acc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                acc.deposit(getName(), 1000);
                Thread.yield();
                sleep(1000);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class JoinTester {
    public static void main(String[] args) throws Exception {
        Account account = new Account(5000);
        System.out.println("Opening Balance:" + account.getBalance());
        User u1 = new User(account);
        User u2 = new User(account);
        u1.setName("Harry");
        u2.setName("Berry");
        u1.start();
        // u1.join();
        u2.start();
        // u2.join();
        System.out.println("Final Balance:" + account.getBalance());
    }
}