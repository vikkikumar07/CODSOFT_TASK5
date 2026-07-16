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

        boolean exit = true;
        while(exit) {
            System.out.println("\n ===== Student Course Registration System =====");
            System.out.println("1. view Courses");
            System.out.println("2. Register Course");
            System.out.println("3. Remove Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: 
                    viewCourse();
                    break;
                case 2:
                    registerCourse();
                    break;
                case 3:
                    removeCourse();
                    break;
                case 4:
                    viewRegisteredCourse();
                    break;
                case 5:
                    System.out.println("Thank You !");
                    exit = false;
                    break;
                default :
                    System.out.println("Invalid Choice!");
            }

        }
    }

    // view course function
    static void viewCourse() {
        System.out.println("\nAvailable Courses");
        for(Course c : courses) {
            System.out.println("\n -----------------------------------");
            System.out.println("Course Code : "+ c.code);
            System.out.println("Course Name : "+ c.title);
            System.out.println("Course Description : "+ c.description);
            System.out.println("Available Slote : "+ c.getAvailableSlots());
        }
    }

    // register course function
    static void registerCourse() {

    }

    // remove course function
    static void removeCourse() {
        
    }

    // view registered Course function
    static void viewRegisteredCourse() {

    }
    
}

