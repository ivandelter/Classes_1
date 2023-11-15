package Exercise_7;
import Exercise_6.Point;

public class Straight{

    private double width;
    private Point pOne;
    private Point pTwo;

    public Straight(double width, Point pOne, Point pTwo){
      this.width = width;
      this.pOne = pOne;
      this.pTwo = pTwo;
    }

    public Straight(double width, int xOne, int xTwo, int yOne, int yTwo){
        this.width = width;
        this.pOne = new Point();
        this.pTwo = new Point();
        this.pOne.setX(xOne);
        this.pTwo.setX(xTwo);
        this.pOne.setY(yOne);
        this.pTwo.setY(yTwo);
    }

    public boolean isHorizontal(){
        return pOne.getY() == pTwo.getY() ? true : false;
    }

    public boolean isVertical(){
        return pOne.getX() == pTwo.getX() ? true : false;
    }

    public Point highestPoint(Straight s){
        return s.pOne.getY() > s.pTwo.getY() ? s.pOne : s.pTwo;
    }

    public double length(){
        double x1 = pOne.getX();
        double y1 = pOne.getY();

        double x2 = pTwo.getX();
        double y2 = pTwo.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static Straight longest(Straight one, Straight two){
        return one.length() > two.length() ? one : two;
    }

    public void show(){
        System.out.println("Width: " + this.width);
        System.out.println("Point one: ");
        pOne.show();
        System.out.println("Point two: ");
        pTwo.show();
    }

}
