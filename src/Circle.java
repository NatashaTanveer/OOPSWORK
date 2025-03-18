public class Circle{
    double radius;
    // default constructor
    public Circle(){
        radius = 3.3;
    }
    // parameterized constructor
    public Circle(double radius) {
        radius = radius;
    }
    public double calculateCircumference(){
        return(2*3.14*radius);

    }
}
