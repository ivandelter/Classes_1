package Exercise_7;
import Exercise_6.Point;

public class main {

    public static void main(String[] args) {

        Point p1 = new Point(2, 2);
        Point p2 = new Point(-5, 3);
        Straight first = new Straight(5, p1, p2);

        System.out.println("Is horizontal: " + first.isHorizontal());
        System.out.println("Is vertical: " + first.isVertical());
        System.out.println("The highest point is: " + first.highestPoint(first));
        System.out.println("The length is: " + first.length());

        Straight second = new Straight(4, 5, 6, -3, -5);

        System.out.println("The longest is: " + Straight.longest(first, second));

    }

}
