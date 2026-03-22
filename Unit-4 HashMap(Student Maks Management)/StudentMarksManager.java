import java.util.*; 
public class StudentMarksManager { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        HashMap<String, Integer> studentMarks = new HashMap<>(); 
        int choice = 0; 
        while (choice != 6) { 
            System.out.println("\n--- Student Marks Manager ---"); 
            System.out.println("1. Add Student"); 
            System.out.println("2. View All Students"); 
            System.out.println("3. Search Student"); 
            System.out.println("4. Update Marks"); 
            System.out.println("5. Delete Student"); 
            System.out.println("6. Exit"); 
            System.out.print("Enter choice: "); 
            choice = sc.nextInt(); 
            sc.nextLine(); 
            if (choice == 1) { 
                System.out.print("Enter student name: "); 
                String name = sc.nextLine(); 
                System.out.print("Enter marks: "); 
                int marks = sc.nextInt(); 
                studentMarks.put(name, marks); 
                System.out.println("Student added!"); 
 
            } else if (choice == 2) { 
                if (studentMarks.isEmpty()) { 
                    System.out.println("No records found."); 
                } else { 
                    for (String key : studentMarks.keySet()) { 
                        System.out.println(key + " -> " + studentMarks.get(key)); 
                    } 
                } 
            } else if (choice == 3) { 
                System.out.print("Enter student name: "); 
                String name = sc.nextLine(); 
                if (studentMarks.containsKey(name)) { 
                    System.out.println("Marks: " + studentMarks.get(name)); 
                } else { 
                    System.out.println("Student not found."); 
                } 
            } else if (choice == 4) { 
                System.out.print("Enter student name: "); 
                String name = sc.nextLine(); 
                if (studentMarks.containsKey(name)) { 
                    System.out.print("Enter ew marks: "); 
                    int marks = sc.nextInt(); 
                    studentMarks.put(name, marks); 
                    System.out.println("Updated successfully!"); 
                } else { 
                    System.out.println("Student not found."); 
                } 
            } else if (choice == 5) { 
                System.out.print("Enter student name: "); 
                String name = sc.nextLine(); 
                if (studentMarks.containsKey(name)) { 
                    studentMarks.remove(name); 
                    System.out.println("Deleted successfully!"); 
                } else { 
                    System.out.println("Student not found."); 
                } 
            } else if (choice == 6) { 
                System.out.println("Exiting program..."); 
            } else { 
                System.out.println("Invalid choice!"); 
            } 
        } 
    } 
}