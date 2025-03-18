public class Rectangle {
    int length;
    int width;
    public int calculateArea(){
        return(length * width);
    }
    // default constructor
//public Rectangle(){
      //  length = 5;
      //  width = 10;
    //System.out.println("The area of rectangle is:");
//}
    //parameterized constructor
public Rectangle(int l, int w){
        length = l;
        width = w;

}
}
