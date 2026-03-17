import java.util.*;

public class BookMyStayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask how many guests to process
        System.out.print("Enter number of bookings to process: ");
        int numberOfBookings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // 2. Collect guest data using a LinkedHashMap to preserve order
        Map<String, String> bookings = new LinkedHashMap<>();
        for (int i = 1; i <= numberOfBookings; i++) {
            System.out.println("\nBooking #" + i);
            System.out.print("Enter Guest Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Room Type (Single/Double/Suite): ");
            String type = scanner.nextLine();

            bookings.put(name, type);
        }

        Map<String, Integer> roomCounters = new HashMap<>();

        System.out.println("\n--- Room Allocation Processing ---");

        // 4. Process the bookings and generate the output
        for (Map.Entry<String, String> entry : bookings.entrySet()) {
            String guestName = entry.getKey();
            String roomType = entry.getValue();

            // Increment the specific counter for this room type
            roomCounters.put(roomType, roomCounters.getOrDefault(roomType, 0) + 1);
            int currentNumber = roomCounters.get(roomType);

            // Print the required output format
            System.out.println("Booking confirmed for Guest: " + guestName +
                    ", Room ID: " + roomType + "-" + currentNumber);
        }

        scanner.close();
    }
}
