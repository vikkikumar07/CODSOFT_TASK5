package CODSOFT_TASK5;

import java.util.Scanner;
import java.util.ArrayList;

public class CourseRegistrationSystem {

    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // course store
        courses.add(new Course("J001", "Programming in java", "class, OOPs, Exception, loops", 10));
        courses.add(new Course("M005", "Mathemetic", "Logical Thinkging", 10));
        courses.add(new Course("P002", "Python", "class, OOPs, Exception, loops", 10));
        courses.add(new Course("W003", "Web Development", "HTML, CSS, JavaScript", 10));
        courses.add(new Course("A006", "App Development", "java, Kotiln", 10));

        
    }
    
}
