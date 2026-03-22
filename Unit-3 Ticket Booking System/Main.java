
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        MovieBooking mb = new MovieBooking(); 
        System.out.println("Welcome to Movie Ticket Booking System"); 
        System.out.println("Select booking option:"); 
        System.out.println("1. Book by Ticket ID"); 
        System.out.println("2. Book by Customer Name"); 
        System.out.println("3. Book by Customer Name and Movie Name"); 
        System.out.print("Enter your choice (1-3): "); 
        int choice = sc.nextInt(); 
        sc.nextLine(); 
        if (choice == 1) { 
            System.out.print("Enter Ticket ID: "); 
            int ticketId = sc.nextInt(); 
            mb.bookTicket(ticketId); 
        } else if (choice == 2) { 
            System.out.print("Enter Customer Name: "); 
            String customerName = sc.nextLine(); 
            mb.bookTicket(customerName); 
        } else if (choice == 3) { 
            System.out.print("Enter Customer Name: "); 
            String customerName = sc.nextLine(); 
            System.out.print("Enter Movie Name: "); 
            String movieName = sc.nextLine(); 
            mb.bookTicket(customerName, movieName); 
        } else { 
            System.out.println("Invalid choice! Please select a valid option."); 
        } 
    } 
} 