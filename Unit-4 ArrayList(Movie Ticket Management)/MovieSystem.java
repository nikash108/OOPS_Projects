import java.util.*; 
class Movie { 
    int bookingId; 
    String movieName; 
    int seatNumber; 
    Movie(int bookingId, String movieName, int seatNumber) { 
        this.bookingId = bookingId; 
        this.movieName = movieName; 
        this.seatNumber = seatNumber; 
    } 
    void display() { 
        System.out.println("ID: " + bookingId + 
                " | Movie: " + movieName + 
                " | Seat: " + seatNumber); 
    } 
} 
 
public class MovieSystem { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        ArrayList<Movie> bookings = new ArrayList<>(); 
        int choice = 0; 
        while (choice != 5) { 
            System.out.println("\n--- Movie Ticket System ---"); 
            System.out.println("1. Book Ticket"); 
            System.out.println("2. View Bookings"); 
            System.out.println("3. Cancel Ticket"); 
            System.out.println("4. Search Booking"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter choice: "); 
            choice = sc.nextInt(); 
            if (choice == 1) { 
                System.out.print("Enter Booking ID: "); 
                int id = sc.nextInt(); 
                sc.nextLine(); 
                System.out.print("Enter Movie Name: "); 
                String name = sc.nextLine(); 
                System.out.print("Enter Seat Number: "); 
                int seat = sc.nextInt(); 
                bookings.add(new Movie(id, name, seat)); 
                System.out.println("Ticket booked!"); 
            } else if (choice == 2) { 
                if (bookings.isEmpty()) { 
                    System.out.println("No bookings found."); 
                } else { 
                    for (Movie m : bookings) { 
                        m.display(); 
                    } 
                } 
            } else if (choice == 3) { 
                System.out.print("Enter Booking ID to cancel: "); 
                int id = sc.nextInt(); 
 
                boolean removed = false; 
                Iterator<Movie> it = bookings.iterator(); 
                while (it.hasNext()) { 
                    if (it.next().bookingId == id) { 
                        it.remove(); 
                        removed = true; 
                        break; 
                    } 
                } 
                if (removed) { 
                    System.out.println("Booking cancelled!"); 
                } else { 
                    System.out.println("Booking not found."); 
                } 
            } else if (choice == 4) { 
                System.out.print("Enter Booking ID to search: "); 
                int id = sc.nextInt(); 
                sc.nextLine();  
                boolean found = false; 
                for (Movie m : bookings) { 
                    if (m.bookingId == id) { 
                        m.display(); 
                        found = true; 
                    } 
                } 
                if (!found) { 
                    System.out.println("Booking not found."); 
                } 
            } else if (choice == 5) { 
                System.out.println("Exiting..."); 
            } else { 
                System.out.println("Invalid choice!"); 
            } 
        } 
    } 
}