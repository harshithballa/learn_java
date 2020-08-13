import java.util.Scanner;
import java.lang.Math;

class Point{
    double x;
    double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}
public class co1{
    public static void main( String[] args){

        Scanner sc = new Scanner(System.in);

        int p11 = sc.nextInt();
        int p12 = sc.nextInt();
        int p21 = sc.nextInt();
        int p22 = sc.nextInt();
        int p31 = sc.nextInt();
        int p32 = sc.nextInt();

        Point p1 = new Point(p11, p12);
        Point p2 = new Point(p21, p22);
        Point p3 = new Point(p31, p32);

        Point res = pointWithHighestOriginDistance(p1, p2, p3 );
        System.out.format("%.1f\n",res.x);
        System.out.format("%.1f\n",res.y);
    }
    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3){
        double d1, d2, d3;
        d1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        d2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        d3 = Math.sqrt(p3.x * p3.x + p3.y * p3.y);

        if (d1 > d2 && d1 > d3)
            return p1;
        else if (d2 > d1 && d2 > d3)
            return p2;
        else
            return p3;

    }
}