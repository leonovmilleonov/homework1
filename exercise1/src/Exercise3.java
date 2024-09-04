public class Exercise3 {
    public static void main(String[] args) {
        double a1 = 10; //first side of triangle a
        double a2 = 10; //second side of triangle a
        double b1 = 10; //first side of triangle b
        double b2 = 10; //second side of triangle b
        compareTriangles(findSquare(a1, a2), findSquare(b1, b2));
    }
    public static double findSquare(double a, double b){
        return (a*b) / 2;
    }
    public static void compareTriangles(double tr1, double tr2){
        if(tr1 > tr2){
            System.out.println("First triangle is greater than second triangle");
        } else if (tr1 < tr2){
            System.out.println("First triangle is less than second triangle");
        } else{
            System.out.println("First triangle is equal to second triangle");
        }
    }
}
