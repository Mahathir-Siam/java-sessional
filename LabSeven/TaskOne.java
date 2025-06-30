public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20 (int): " + calc.add(10, 20));
        System.out.println("Sum of 3.5 and 2.2 (double): " + calc.add(3.5, 2.2));
        System.out.println("Sum of 1, 2, and 3 (int): " + calc.add(1, 2, 3));
    }
}
