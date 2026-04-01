class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two floating-point numbers
    float add(float a, float b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of two floating values: " + calc.add(5.5f, 4.5f));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
    }
}