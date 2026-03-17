import java.util.ArrayList;
import java.util.List;

// Domain object to store room details
class Room {
    String type;
    int beds;
    int size;
    double price;
    int available;

    public Room(String type, int beds, int size, double price, int available) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
        this.available = available;
    }

    public void displayInfo() {
        System.out.println(this.type + ":");
        System.out.println("Beds: " + this.beds);
        System.out.println("Size: " + this.size + " sqft");
        System.out.println("Price per night: " + this.price);
        System.out.println("Available: " + this.available + "\n");
    }
}

// Main class matching the requested filename Room_UC4.java
public class Room_UC4 {
    public static void main(String[] args) {
        // Initialize room data based on the provided image
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Single Room", 1, 250, 1500.0, 5));
        rooms.add(new Room("Double Room", 2, 400, 2500.0, 3));
        rooms.add(new Room("Suite Room", 3, 750, 5000.0, 2));

        // Display Header
        System.out.println("Room Search\n");

        // Iterate through rooms and display details
        for (Room room : rooms) {
            room.displayInfo();
        }
    }
}
