public class Distance {
    int inches;
    int feet;

    // default constructor
    public Distance() {
        inches = 4;
        feet = 5;
        System.out.println("The inches is:  " + inches + "The feet is:" + feet);
    }

    //   parametrized constructor
    public Distance(int inches, int feet) {
        this.inches = inches;
        this.feet = feet;
        System.out.println("The inches is:" + inches + "The feet is:" + feet);
    }

    public void displayDistance() {
        System.out.println("The inches is:" + inches + "and The feet is :" + feet);
    }
}




