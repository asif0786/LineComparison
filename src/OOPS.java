class LineComparison{
    double x1,x2,y1,y2,p1,p2,q1,q2,line1,line2;

    public double line1(){
        line1 = (Math.sqrt(x2-x1)) + (Math.sqrt(y2-y1));
        return line1;
    }

    public double line2(){
        line2 = (Math.sqrt(p2-p1)) + (Math.sqrt(q2-q1));
        return line2;
    }
}
public class OOPS {
    public static void main(String[] args) {
        LineComparison l1 = new LineComparison();
        int compareValue = l1.line1.compareTo(l1.line2);

        if(compareValue == 0){
            System.out.println("Line1 = "+l1.line1+" is greater than Line2 = "+l1.line2);
        }
        else if(compareValue<0){
            System.out.println("Line2 = "+l1.line2+" is greater than Line1 = "+l1.line1);
        } else{
            double sub =  (l1.line1 -  l1.line2);
            System.out.println("Line1 = "+l1.line1+" and Line2 = "+l1.line2+".\nBoth are equal!");
        }
    }
}
