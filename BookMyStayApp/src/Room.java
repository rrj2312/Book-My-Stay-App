public abstract class Room {
    private String type;
    private int beds;
    private int size; // Added size
    private double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public String getType() { return type; }
    public int getBeds() { return beds; }
    public int getSize() { return size; }
    public double getPrice() { return price; }

    public abstract void displayDetails();
}
class SingleRoom extends Room {
    public SingleRoom() { super("Single", 1, 250, 1500.0); }
    @Override
    public void displayDetails() {
        System.out.println(getType() + " Room:\nBeds: " + getBeds() + "\nSize: " + getSize() + " sqft\nPrice per night: " + getPrice());
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() { super("Double", 2, 400, 2500.0); }
    @Override
    public void displayDetails() {
        System.out.println(getType() + " Room:\nBeds: " + getBeds() + "\nSize: " + getSize() + " sqft\nPrice per night: " + getPrice());
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() { super("Suite", 3, 750, 5000.0); }
    @Override
    public void displayDetails() {
        System.out.println(getType() + " Room:\nBeds: " + getBeds() + "\nSize: " + getSize() + " sqft\nPrice per night: " + getPrice());
    }
}

