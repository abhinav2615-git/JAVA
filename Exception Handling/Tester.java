import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter total number:");
            int count = scan.nextInt();
            int[] num = { 2, 4, 5, 6, 10 };
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum = sum + num[i];
                System.out.println("sum:" + sum);
            }

            float avg = sum / count;
            System.out.println("Average: " + avg);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}