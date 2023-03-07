import java.util.Scanner;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        // Program to endpoints input and find length of line is equal or not
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter x1");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1");
        double y1 = sc.nextDouble();
        System.out.println("Enter x2");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2");
        double y2 = sc.nextDouble();
        double line1 = (Math.sqrt(x2-x1)) + (Math.sqrt(y2-y1));

        System.out.println("Enter p1");
        double p1 = sc.nextDouble();
        System.out.println("Enter q1");
        double q1 = sc.nextDouble();
        System.out.println("Enter p2");
        double p2 = sc.nextDouble();
        System.out.println("Enter q2");
        double q2 = sc.nextDouble();

        double line2 = (Math.sqrt(p2-p1)) + (Math.sqrt(q2-q1));
        System.out.println("Length of line1 = "+line1+ " and Length of line2 = "+line2);
        System.out.println(Objects.equals(line2, line1));
        sc.close();
    }
}