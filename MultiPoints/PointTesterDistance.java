package MultiPoints;
import java.util.*;
/**
 * Class PointTesterDistance
 * Tester class for the point SuperClass and the distance method
 * @author Daniel Santoyo
 */
public class PointTesterDistance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and y for two points a and b");
        Point p1 = new Point(scan.nextDouble(), scan.nextDouble());
        Point p2 = new Point(scan.nextDouble(), scan.nextDouble());
        distance(p1,p2);
    }

    public static void distance(Point p1, Point p2){
        double distanceFinal = Point.distance(p1, p2);
        System.out.printf("The distance between (%.2f,%.2f) and (%.2f,%.2f) is %.2f",
                p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
