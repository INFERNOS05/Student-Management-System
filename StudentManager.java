import java.util.ArrayList;  
import java.util.Scanner;    

//Manages a list of students with operations like add, search, update, and delete.
public class StudentManager {
    private ArrayList<Student> students;  

    // Constructor initializes student list
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Adds a new student from user input
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter DOB (dd/mm/yyyy): ");
        String dob = sc.next();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(prn, name, dob, marks)); 
        System.out.println("Student added successfully!");
    }

    // Displays all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Searches a student by PRN
    public void searchByPRN(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    // Searches a student by name
    public void searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("Student with Name " + name + " not found.");
    }

    // Displays student at a given position
    public void searchByPosition(int index) {
        if (index < 0 || index >= students.size()) {
            System.out.println("Invalid position!");
            return;
        }
        students.get(index).displayStudent();
    }

    // Updates student details using PRN
    public void updateStudent(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new Name: ");
                student.setName(sc.next());
                System.out.print("Enter new DOB: ");
                student.setDob(sc.next());
                System.out.print("Enter new Marks: ");
                student.setMarks(sc.nextDouble());
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    // Deletes a student using PRN
    public void deleteStudent(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}

