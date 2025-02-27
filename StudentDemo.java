// Define the Student class
class Student {
    // Private attributes for encapsulation
    private String name;
    private int id;
    private double gpa;

    // Static variable to keep track of the number of students created
    private static int studentCount = 0;

    // Constructor to initialize name, id, and gpa, and increment the studentCount
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++; // Increment the studentCount each time a new student is created
    }

    // Instance method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students created
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class to run the program
public class StudentDemo {
    public static void main(String[] args) {
        // Create three Student objects with different details
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Display information of each student using the instance method
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Display the total number of students created using the static method
        Student.displayStudentCount();
    }
}
