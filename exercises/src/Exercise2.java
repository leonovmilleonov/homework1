/**
Задание 2

Даны 3 переменные:

- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)

Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.

Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
 */

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
