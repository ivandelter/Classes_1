package Exercise_7;
import Exercise_6.Point;

public class Straight_Solved {

    private float width;
    private Point p1;
    private Point p2;

    public Straight_Solved(float width, Point p1, Point p2){
        this.width = width;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Straight_Solved(float width, double xOne, double xTwo, double yOne, double yTwo){
        this.width = width;
        this.p1 = new Point();
        this.p2 = new Point();
        this.p1.setX(xOne);
        this.p2.setX(xTwo);
        this.p1.setY(yOne);
        this.p2.setY(yTwo);
    }

}
