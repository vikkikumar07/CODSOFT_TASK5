package CODSOFT_TASK5;
import java.util.ArrayList;

public class Student {
    String name;
    int id;
    ArrayList<course> registeredCourses;

    public void Student(String name, int id) {
        this.name = name;
        this.id = id;
        registeredCourses =new ArrayList<>();
    }
    
}
