import java.util.Scanner;

class timeaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first time (hh mm ss): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.print("Enter second time (hh mm ss): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        int seconds = s1 + s2;
        int carryMinutes = seconds / 60;
        seconds = seconds % 60;

        int minutes = m1 + m2 + carryMinutes;
        int carryHours = minutes / 60;
        minutes = minutes % 60;

        int hours = h1 + h2 + carryHours;
        hours = hours % 24;

        System.out.printf("Resultant Time: %02d:%02d:%02d\n", hours, minutes, seconds);

        sc.close();
    }
}