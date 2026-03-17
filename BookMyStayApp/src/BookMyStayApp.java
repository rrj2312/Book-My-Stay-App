import java.util.LinkedList;
import java.util.Queue;

class BookingRequest {
    String guestName;
    String roomType;

    BookingRequest(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        // Create the queue and add the requests in order
        Queue<BookingRequest> queue = new LinkedList<>();
        queue.add(new BookingRequest("Abhi", "Single"));
        queue.add(new BookingRequest("Subha", "Double"));
        queue.add(new BookingRequest("Vanmathi", "Suite"));

        System.out.println("Booking Request Queue");

        // Process the queue until it is empty
        while (!queue.isEmpty()) {
            BookingRequest request = queue.poll(); // Removes the head of the queue
            System.out.println("Processing booking for Guest: " + request.guestName +
                    ", Room Type: " + request.roomType);
        }
    }
}
