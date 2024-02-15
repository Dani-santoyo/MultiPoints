package MultiPoints;
/**class: SixPointTester
 * description - Contains methods that allow for the entry of points as well as computation for the shortest distance
 * between entered points
 * @author: Daniel Santoyo
 */
import java.util.*;
public class SixPointTester {
    public static Scanner input = new Scanner(System.in);

    //main - will test the enterPoints and computeShortestDistance methods
    public static void main(String[] args){
        computeShortestDistance(enterPoints());
    }

    //enterPoints - will ask user for 6 sets of a character, x, and y value. Returns an array of these 6 sets
    public static NamedPoint[] enterPoints() {
        NamedPoint[] points = new NamedPoint[6];
        System.out.println("Please Enter a character, followed by an x and y value. Do this 6 times");
        for (int i = 0; i < points.length; i++) {
            points[i] = new NamedPoint(input.next(),input.nextDouble(), input.nextDouble());
        }
        return points;
    }
    //Takes an array of NamedPoints and returns the shortest distance between two points in the array
    public static void computeShortestDistance(NamedPoint[] points) {
        double shortestDistance = Double.MAX_VALUE;
        Point p1 = null;
        Point p2 = null;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = Point.distance(points[i], points[j]);
                if (dist < shortestDistance) {
                    shortestDistance = dist;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
            System.out.println(points[i]);
        }

        System.out.println("The shortest distance is between points " + p1 + " and " + p2);
    }
}