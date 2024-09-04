public class Exercise2 {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 0;
        System.out.println("Result: " + function(a, b, '*'));
        System.out.println("Result: " + function(a, c, '-'));
        System.out.println("Result: " + function(a, c, '/'));
        System.out.println("Result: " + function(b, a, '/'));
    }

    public static double function(double a, double b, char operation) {
        //check division by zero
        if ((operation == '/' || operation == '%') && b == 0) {
            System.out.println("Division by zero");
            return 0;
        }
        //other cases without throwing an exception
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 0;
        };
    }
}
