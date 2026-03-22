🎓 Student Management System (Java)

A simple console-based Java application to manage and display student records using Object-Oriented Programming principles.

📖 Project Description

This application allows users to:

Input details for multiple students

Store student data using a custom Student class

Display all stored student records in a formatted manner

The program demonstrates fundamental Java concepts such as classes, constructors, arrays of objects, user input handling, and data type conversion.

🧠 Concepts Used

Object-Oriented Programming (OOP)

Classes and Objects

Parameterized Constructors

Arrays of Objects

Java Scanner Class

String Manipulation (split() method)

Type Conversion (parseInt, parseLong, parseDouble)

🏗 Project Structure
StudentManagement/
│
└── Main.java

🔹 Student Class

Defines student attributes:

Name

Age

Course

Department

Registration Number

College

CGPA

Email

Includes a parameterized constructor to initialize all fields.

🔹 Main Class

Reads the number of students

Accepts comma-separated student input

Parses and converts input values

Stores student objects in an array

Displays student details

▶️ How to Run
1️⃣ Compile the Program
javac Main.java

2️⃣ Run the Program
java Main

📝 Input Format

For each student, enter details in the following comma-separated format:

Name,Age,Course,Department,RegisterNo,College,CGPA,Email

✅ Example Input
Enter the number of students:
1
Enter the student order:1
John,20,BSc,Computer Science,123456,ABC College,8.5,john@gmail.com

💻 Sample Output
|||||||Student Details|||||||
Name:John
Age:20
Course:BSc
Department:Computer Science
Register No:123456
College:ABC College
CGPA:8.5
Email:john@gmail.com

🚀 Future Enhancements

Add input validation and error handling

Implement search functionality (by name or register number)

Add update and delete operations

Use ArrayList instead of array for dynamic storage

Save student records to a file

Add menu-driven interface

📌 Author

Nikash Manoharan
