# Student-Management-System
# Student Management System

## Overview
This project is a simple **Student Management System** implemented in Java.  
It allows users to manage student records by performing operations like adding, searching, updating, and deleting student details through a menu-driven interface.

## Files in the Project
The system is structured into three Java files:

1. **`Student.java`**  
   - Represents a Student with attributes: PRN (Permanent Registration Number), Name, DOB, and Marks.  
   - Provides methods to get, set, and display student details.

2. **`StudentManager.java`**  
   - Manages a collection of students using an ArrayList.  
   - Provides operations to add, display, search (by PRN, Name, and Position), update, and delete student records.

3. **`Main.java`**  
   - Serves as the entry point of the program.  
   - Implements a menu-driven interface for user interaction.  
   - Calls methods from `StudentManager.java` based on user input.

## Features
- **Add Student**: Allows users to input student details and store them.  
- **Display Students**: Lists all stored students.  
- **Search Student**: Find students by PRN, Name, or Position.  
- **Update Student**: Modify an existing student's details.  
- **Delete Student**: Remove a student record.  
- **Exit**: Safely terminates the program.

## How to Run the Program
1. Compile all three Java files:
   ```sh
   javac Student.java StudentManager.java Main.java
