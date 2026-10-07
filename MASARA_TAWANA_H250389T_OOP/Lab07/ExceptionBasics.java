package Lab07;

public class ExceptionBasics {
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("10 / 0 = " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Math problem: " + e.getMessage());
        } finally {
            System.out.println("finally always runs");
        }
    }
}