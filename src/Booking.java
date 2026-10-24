import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Booking {
    private int bookingId;
    private Guest guest;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int guestCount;
    private double amount;
    private String bookingStatus;
    private String paymentStatus;
    private String paymentMode; 
public Booking(int bookingId, Guest guest,Room room, LocalDate checkIn, LocalDate checkOut, int guestCount, double amount, String bookingStatus,String paymentMode, String paymentStatus){
    this.bookingId=bookingId;
    this.guest= guest;
    this.room=room;
    if(checkIn==null||checkOut==null||checkOut.isBefore(checkIn)||checkIn.isEqual(checkOut)){
        throw new IllegalArgumentException("Invalid booking dates");
    }
    this.checkIn=checkIn;
    this.checkOut=checkOut;
    this.guestCount=guestCount;
    this.amount=amount;
    this.bookingStatus=bookingStatus;
    this.paymentMode=paymentMode;
    this.paymentStatus=paymentStatus;
}
public int getBookingId(){
    return bookingId;
}
public String getGuest(){
    return guest.getName();
}
public Room getRoom(){
    return room;
}
public LocalDate getCheckIn(){
    return checkIn;
}
public LocalDate getCheckOut(){
    return checkOut;
}
public int getGuestCount(){
    return guestCount;
}
public double getAmount(){
    return amount;
}
public String getBookingStatus(){
    return bookingStatus;
}
public String getPaymentStatus(){
    return paymentStatus;
}
public String getPaymentMode(){
    return paymentMode;
}
public long getNights(){
    return ChronoUnit.DAYS.between(checkIn,checkOut);
}
}
