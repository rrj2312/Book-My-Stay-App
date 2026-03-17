public class BookMyStayApp {
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization\n");

        // Availability variables
        int singleAvail = 5;
        int doubleAvail = 3;
        int suiteAvail = 2;

        Room s = new SingleRoom();
        s.displayDetails();
        System.out.println("Available: " + singleAvail + "\n");

        Room d = new DoubleRoom();
        d.displayDetails();
        System.out.println("Available: " + doubleAvail + "\n");

        Room st = new SuiteRoom();
        st.displayDetails();
        System.out.println("Available: " + suiteAvail);
    }
}
