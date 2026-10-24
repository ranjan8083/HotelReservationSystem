import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
public class Hotel {
    private List<Room> rooms = new ArrayList<>();
    public Hotel(){
        rooms.add(new Room(101, "Standard", true, 1500.00));
        rooms.add(new Room(102, "Standard", true, 1500.00));
        rooms.add(new Room(201, "Deluxe", true, 2500.00));
        rooms.add(new Room(202, "Deluxe", true, 2500.00));
        rooms.add(new Room(301, "Suite", true, 4500.00));
    }
    public void displayAvailableRooms(){
    for(Room room : rooms){
        if(room.isAvailable()){
            System.out.println(room.getRoomNo()+"\t"+room.getPrice()+"\t"+room.getRoomType());
        }
    }
    }
    int counter=1001;
    private List<Booking> bookings = new ArrayList<>();
    public void bookRoom(int search,Guest guest, LocalDate checkIn ,LocalDate checkOut){
        Boolean available =false;
        for(Room room:rooms){
            if(search==room.getRoomNo()){
                available=true;
                if(room.isAvailable()){
                    long nights=ChronoUnit.DAYS.between(checkIn, checkOut);
                    double amount=nights*room.getPrice();
                    bookings.add(new Booking(counter, guest, room, checkIn, checkOut, 1, amount, "BOOKED", null, "PENDING"));
                    room.setAvailable(false); 
                    counter++;
                    System.out.println("Booking Confirmed");
                }else{
                    System.out.println("Alredy Booked");
                }
            }    
        }
        if(available==false){
            System.out.println("Room Doesn't exist");
        }

    }
}
