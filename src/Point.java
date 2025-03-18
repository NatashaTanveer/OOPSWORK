public class Point {
  public  int x;
  public  int y;

    // default constructor
    public Point() {
       x = 1;
       y = 2;
    }

    // parametrized constructor
    public Point(int a, int b){
    x =a;
    y =b;
}
public void display() {
    System.out.println("x coordinate = " + x + " y coordinate = "
            + y);
}
public void movePoint(int a, int b){
        x = x+a;
        y = y+b;
    System.out.println("x coordinate after moving =" + x +"y coordinate after moving =" +y);

    }
}
