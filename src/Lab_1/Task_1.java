
package Lab_1;
public class Task_1 {
    public String name;
    public double CGPA;
    public String RollNo;
    public int semester;

    void dispalyinfo () {
        System.out.println("name is:"+name);
        System.out.println("CGPA IS:"+CGPA);
        System.out.println("RollNo is:"+RollNo);
        System.out.println("semester is:"+semester);
        //  System.out.println("student details is:"+name+" "+CGPA+ " "+RollNo+" " +semester);
        // public void Set_Details(String name,double CGPA,int semester,String RollNo){
        // name=name;
        // CGPA=CGPA;
        // semester=semester;
        //RollNo=RollNo;;
    }
}
class Student {
    public void main(String[] args) {
        Task_1 Natasha= new Task_1();
        // Sidra.Set_Details("Sidra",3.88,3,"sp24-bcs-123");
        // Sidra.Set_Details();
        Natasha.name = "Natasha";
        Natasha.CGPA = 3.5;
        Natasha.RollNo = "Sp24-BCS-123";
        Natasha.semester = 3;
        Natasha.dispalyinfo ();

    }
}