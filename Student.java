package CODSOFT_TASK5;
import java.util.ArrayList;

public class Student {
    String name;
    int id;
    ArrayList<Course> registeredCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        registeredCourses =new ArrayList<>();
    }
    
}
