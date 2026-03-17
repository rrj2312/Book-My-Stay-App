import java.util.LinkedHashMap;
import java.util.Map;

// Class to represent detailed Room information
class Room_UC3 {
    int beds;
    int sizeSqft;
    double price;
    int available;

    public Room_UC3(int beds, int sizeSqft, double price, int available) {
        this.beds = beds;
        this.sizeSqft = sizeSqft;
        this.price = price;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Beds: " + beds + "\n" +
                "Size: " + sizeSqft + " sqft\n" +
                "Price per night: " + price + "\n" +
                "Available Rooms: " + available;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        // LinkedHashMap maintains the order of insertion (Single -> Double -> Suite)
        Map<String, Room_UC3> inventory = new LinkedHashMap<>();

        // 1. Data Setup based on your image
        inventory.put("Single Room", new Room_UC3(1, 250, 1500.0, 5));
        inventory.put("Double Room", new Room_UC3(2, 400, 2500.0, 3));
        inventory.put("Suite Room",  new Room_UC3(3, 750, 5000.0, 2));

        // 2. Generating the Output
        System.out.println("Hotel Room Inventory Status\n");

        for (Map.Entry<String, Room_UC3> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ":");
            System.out.println(entry.getValue());
            System.out.println(); // Blank line between room types
        }
    }
}
