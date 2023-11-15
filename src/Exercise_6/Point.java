package Exercise_6;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void quadrant(){
        System.out.println(this.x >= 0 ? this.y >= 0 ? "Quadrant 1 (top-right)" : "Quadrant 4 (bottom-right)" : this.y >= 0 ? "Quadrant 2 (top-left)" : "Quadrant 3 (bottom-left)");
    }

    public void show(){
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
    }

}
