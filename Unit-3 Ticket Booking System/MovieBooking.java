class MovieBooking { 
    void bookTicket(int ticketId) { 
        System.out.println("Booking using Ticket ID: " + ticketId); 
        System.out.println("Ticket ID " + ticketId + " is successfully confirmed."); 
    } 
    void bookTicket(String customerName) { 
        System.out.println("Booking tickets for customer: " + customerName); 
        System.out.println(customerName + " has booked 2 tickets."); 
    } 
    void bookTicket(String customerName, String movieName) { 
        System.out.println("Booking for customer: " + customerName + " for movie: " + movieName); 
        System.out.println("Ticket for " + movieName + " is confirmed for " + customerName + "."); 
    } 
}