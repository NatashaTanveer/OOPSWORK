public class Student {
    private String Name;
    private int[] Result_array;
    // para constructor
    public Student(String name, int[]marks) {
        Name = name;
        Result_array = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int[] getResult_array() {
        return Result_array;
    }

    public void setResult_array(int[] result_array) {
        Result_array = result_array;
    }
    public int Average(){
        int sum = 0;
        for(int i=0; i<Result_array.length;i++) {
            sum += Result_array[i];
        }
        return sum/5;
        }
}

