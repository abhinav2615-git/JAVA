public class SleepTester extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(getName() + ":" + i);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SleepTester s1 = new SleepTester();
        SleepTester s2 = new SleepTester();
        s1.setName("Harry");
        s2.setName("Berry");
        s1.setPriority(1);
        s2.setPriority(10);
        s1.start();
        s2.start();

    }
}