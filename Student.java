import java.util.Date; 

//Represents a student with PRN, name, DOB, and marks.
public class Student {
    private String prn;    
    private String name;   
    private String dob;    
    private double marks;  

    // Constructor to initialize student details
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Getters and setters
    public String getPrn() { return prn; }
    public void setPrn(String prn) { this.prn = prn; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    // Display student details
    public void displayStudent() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks);
    }
}

