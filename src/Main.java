import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Program to endpoints input and find length of line is equal or not
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter co-ordinates of Line1");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter co-ordinates of Line2");
        System.out.print("Enter p1: ");
        double p1 = sc.nextDouble();
        System.out.print("Enter q1: ");
        double q1 = sc.nextDouble();
        System.out.print("Enter p2: ");
        double p2 = sc.nextDouble();
        System.out.print("Enter q2: ");
        double q2 = sc.nextDouble();

        Double line1 = (Math.sqrt(x2-x1)) + (Math.sqrt(y2-y1));
        Double line2 = (Math.sqrt(p2-p1)) + (Math.sqrt(q2-q1));

        int compareValue = line1.compareTo(line2);

        if(compareValue == 0){
            System.out.println("Line1 = "+line1+" is greater than Line2 = "+line2);
        }
        else if(compareValue<0){
            System.out.println("Line2 = "+line2+" is greater than Line1 = "+line1);
        } else{
            double sub =  (line1 -  line2);
            System.out.println("Line1 = "+line1+" and Line2 = "+line2+".\nBoth are equal!");
        }
        sc.close();
    }
}