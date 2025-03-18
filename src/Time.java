
import java.util.Scanner;
public class Time {
    int hours;
    int minutes;
    int seconds;
 // ......default constructor.....
    public Time() {
     hours = 24;
        minutes = 60;
       seconds = 60;
    }
 //...... paramaterized constructor........
   // public Time(int a, int b, int c) {
   //     hours = a;
   //     minutes = b;
    //    seconds = c;
   // }
    public void setHours() {
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("Enter the hours:");
        int hours = scanner_obj.nextInt();
        if (hours <= 24) {
            System.out.println("The time is valid");
        } else {
            System.out.println("The time is not valid");
        }
    }
    public void setMinutes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minutes:");
        int minutes = scanner.nextInt();
        if (minutes <= 60) {
            System.out.println("The time is valid");
        } else {
            System.out.println("The time is not valid");
        }
    }
    public void setSeconds() {
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("Enter the seconds:");
        int hours = scanner_obj.nextInt();
        if (seconds <= 60) {
            System.out.println("The time is valid");
        } else {
            System.out.println("The time is not valid");
        }
    }

public void displayTime(){
    System.out.println("The time is:"+hours+":"+minutes+":"+seconds );
}
}