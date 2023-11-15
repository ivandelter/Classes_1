package Exercise_7;
import Exercise_6.Point;

public class Straight{

    private String width;
    private Point pOne;
    private Point pTwo;

    public Straight(String width, Point pOne, Point pTwo){
      this.width = width;
      this.pOne = pOne;
      this.pTwo = pTwo;
    }

    public Straight(String width, int xOne, int xTwo, int yOne, int yTwo){
        this.width = width;
        this.pOne.setX(xOne);
        this.pTwo.setX(xTwo);
        this.pOne.setY(yOne);
        this.pTwo.setY(yTwo);
    }

    public boolean isHorizontal(){
        return width.equals("horizontal") ? true : false;
    }

    public boolean isVertical(){
        return width.equals("vertical") ? true : false;
    }

    public Point highestPoint(Point one, Point Two){

        return pOne;
    }

    public int length(int number){

        return 0;
    }

    public Straight longest(Straight one, Straight two){

        return one;
    }

    public void show(){
        System.out.println("Width: " + this.width);
        System.out.println("Point one: ");
        pOne.show();
        System.out.println("Point two: ");
        pTwo.show();
    }

}
