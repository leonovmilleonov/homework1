import org.w3c.dom.ls.LSOutput;

public class Exercise1 {
    public static void main(String[] args) {
        printMinutes(59);
    }

    public static void printMinutes(int minutes) {
        System.out.println("Minutes: " + minutes);
        int quarter = (minutes / 15) + 1;
        System.out.println("Quarter: " + quarter);
    }
}
