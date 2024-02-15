package MultiPoints;

/**
 * Class: NamedPoint
 * 2 double type fields inherited by the Points SuperClass as well as a String field
 * @Author Daniel Santoyo
 */
public class NamedPoint extends Point {
    private String name;
    public NamedPoint(String name, double x, double y){
        super(x,y);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + super.toString();
//        return name + "(" + super.getX() + ", " + super.getY() + ")";
    }
}
