# 📝 Problem Statement: Student Grade Manager (Java OOP)

## 🎯 Objective  
Build a **Student Grade Manager** in Java that allows users (teachers/admins) to manage students, record grades, and generate reports.  
The project should demonstrate **OOP principles** such as encapsulation, inheritance, and polymorphism.  

---

## ✅ Requirements  

### 1. Core Features
- **Student Management**
  - Add new students (Name, Roll Number, Course).  
  - View details of existing students.  
  - Update student information.  
  - Delete a student record.  

- **Grade Management**
  - Add grades for different subjects per student.  
  - Calculate overall average and GPA.  
  - Assign letter grades (A, B, C, etc.) based on predefined thresholds.  

- **Reports**
  - View a student’s report card (all subjects + GPA + grade).  
  - View class topper and bottom performer.  
  - Generate overall class statistics (average GPA, pass percentage).  

---

### 2. Technical Specifications
- **Classes**
  - `Student` → holds student details and grades.  
  - `Course` → optional, if you want to manage multiple courses.  
  - `GradeManager` → logic for adding, updating, calculating grades.  
  - `ReportGenerator` → responsible for printing student reports/statistics.  
  - `Main` (CLI Handler) → menu-driven program for user interaction.  

- **Data Storage**
  - Use `ArrayList` or `HashMap` to store students and grades.  
  - Add optional **file I/O** (save student data to a `.txt` or `.csv` file and reload it).  

- **Input/Output**
  - Menu-driven CLI example:  
    ```
    1. Add Student  
    2. Add Grades  
    3. View Student Report  
    4. View Class Statistics  
    5. Exit
    ```

---

### 3. Bonus Features (Optional Enhancements)
- Export reports as text/CSV file.  
- GPA calculation using weighted grading.  
- Authentication (login system for teacher/admin).  
- Exception handling for invalid inputs.  
- Sorting students by GPA, name, or roll number.  

---

## 📌 Expected Outcome  
By completing this project, you’ll learn how to:  
- Design and implement classes with proper **OOP design principles**.  
- Use **collections** (`ArrayList`, `HashMap`) for data management.  
- Perform **file handling** in Java.  
- Write a menu-driven **CLI application**.  
