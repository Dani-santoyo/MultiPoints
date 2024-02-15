package MultiPoints;
import java.math.*;

public class Point {
    private double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + (Math.pow((p2.getY() - p1.getY()), 2)));
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
