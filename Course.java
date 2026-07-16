package CODSOFT_TASK5;

public class Course {
    String code;
    String title;
    String description;
    int capacity;
    int enrolled;

    public Course(String code, String title,String description, int capacity) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public int getAvailableSlots() {
        return capacity - enrolled;
    }
    
}
