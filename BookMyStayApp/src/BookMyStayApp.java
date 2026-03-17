import java.util.ArrayList;
import java.util.List;

// Data model representing a confirmed reservation
class Reservation {
    private int bookingId;
    private String guestName;
    private String roomType;
    private double amount;

    public Reservation(int bookingId, String guestName, String roomType, double amount) {
        this.bookingId = bookingId;
        this.guestName = guestName;
        this.roomType = roomType;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Guest: %-12s | Room: %-10s | Total: $%.2f",
                bookingId, guestName, roomType, amount);
    }

    public double getAmount() { return amount; }
}

// Service to handle reporting (Separation of Concerns)
class BookingReportService {
    public void generateSummaryReport(List<Reservation> history) {
        System.out.println("\n--- BOOKING SUMMARY REPORT ---");
        if (history.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        double totalRevenue = 0;
        for (Reservation res : history) {
            System.out.println(res);
            totalRevenue += res.getAmount();
        }
        System.out.println("------------------------------");
        System.out.printf("Total Bookings: %d\n", history.size());
        System.out.printf("Total Revenue:  $%.2f\n", totalRevenue);
        System.out.println("------------------------------");
    }
}

// Main application class
public class BookMyStayApp {
    // Booking History - maintains a record of confirmed reservations
    private List<Reservation> bookingHistory = new ArrayList<>();
    private BookingReportService reportService = new BookingReportService();

    // Flow: Confirmed reservation is added to history
    public void confirmBooking(int id, String name, String type, double price) {
        Reservation newBooking = new Reservation(id, name, type, price);
        bookingHistory.add(newBooking); // Records kept in insertion order
        System.out.println("System: Booking confirmed and added to history for " + name);
    }

    public void adminRequestsReports() {
        reportService.generateSummaryReport(bookingHistory);
    }

    public static void main(String[] args) {
        BookMyStayApp app = new BookMyStayApp();

        // Simulate booking flows
        app.confirmBooking(101, "Alice Smith", "Deluxe", 250.00);
        app.confirmBooking(102, "Bob Johnson", "Standard", 150.00);
        app.confirmBooking(103, "Charlie Day", "Luxury", 500.00);

        // Admin requests reports
        app.adminRequestsReports();
    }
}
