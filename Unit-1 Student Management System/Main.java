import java.io.*; 
import java.util.*; 
class Student { 
   String name; 
    int age; 
    String course; 
    String department; 
    long regNo; 
    String college; 
    double cgpa; 
    String email; 
    Student(String a, int b, String c, String d, long e, String f, double g, String h) { 
        this.name = a; 
        this.age = b; 
        this.course = c; 
        this.department = d; 
        this.regNo = e; 
        this.college = f; 
        this.cgpa = g; 
        this.email = h; 
    } 
} 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of students:"); 
        int n = sc.nextInt(); 
        sc.nextLine(); 
        Student[] s = new Student[n]; 
        for (int i = 0; i < n; i++) { 
            System.out.println("Enter the student order:" + (i + 1)); 
            String input = sc.nextLine(); 
            String[] arr = input.split(","); 
            String a = arr[0]; 
            int b = Integer.parseInt(arr[1]); 
            String c = arr[2]; 
            String d = arr[3]; 
            long e = Long.parseLong(arr[4]); 
            String f = arr[5]; 
            double g = Double.parseDouble(arr[6]); 
            String h = arr[7]; 
            s[i] = new Student(a, b, c, d, e, f, g, h); 
        } 
        System.out.println("|||||||Student Details|||||||"); 
        for (int i = 0; i < n; i++) { 
            System.out.println("Name:" + s[i].name); 
            System.out.println("Age:" + s[i].age); 
            System.out.println("Course:" + s[i].course); 
            System.out.println("Department:" + s[i].department); 
            System.out.println("Register No:" + s[i].regNo); 
            System.out.println("College:" + s[i].college); 
            System.out.println("CGPA:" + s[i].cgpa); 
            System.out.println("Email:" + s[i].email); 
        } 
    } 
} 