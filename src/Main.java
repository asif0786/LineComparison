import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        // Program to endpoints input and find length of line
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter x1");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1");
        double y1 = sc.nextDouble();
        System.out.println("Enter x2");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2");
        double y2 = sc.nextDouble();
        double line = (Math.sqrt(x2-x1)) + (Math.sqrt(y2-y1));
        System.out.println("Length of line = "+line);
        sc.close();
    }
}