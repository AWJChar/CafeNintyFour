package cafe94;

/**
 *
 */
public class bookings {
    private static int bookingID = 0;
    private final int customerID;
    private int date;
    private int time;
    private int partySize;
    private String requests;

    public bookings (int customerID, int date,
                     int time, int partySize, String requests){
        bookingID = bookingID++;
        this.customerID = customerID;
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.requests = requests;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public void setRequests(String requests) {
        this.requests = requests;
    }

    public static int getBookingID() {
        return bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public int getPartySize() {
        return partySize;
    }

    public String getRequests(){
        return requests;
    }
}
