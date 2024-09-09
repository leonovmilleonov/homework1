

/**
 * Задание 1
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes
 * и выводит на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class Exercise1 {
    private static final int QUARTER = 1;
    public static void main(String[] args) {
        printMinutes(59);
    }

    public static void printMinutes(int minutes) {
        int quarter = (minutes / 15) + QUARTER;
        System.out.println("Quarter: " + quarter);
    }
}
