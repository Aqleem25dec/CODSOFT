import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class StudentRegistrationSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int studentIdCounter = 1;
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Register Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
    private static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        Student student = new Student(studentIdCounter, name);
        students.add(student);
        studentIdCounter++;
        System.out.println("Student registered successfully!");
    }
    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
        } else {
            System.out.println("List of registered students:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            }
        }
    }
    private static void searchStudentById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int idToSearch = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == idToSearch) {
                System.out.println("Student found - ID: " + student.getId() + ", Name: " + student.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + idToSearch + " not found.");
        }
    }
}