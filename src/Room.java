
public class Room {

    private int roomNo;
    private String roomType;
    private boolean available;
    private double price;

    public Room(int roomNo, String roomType, boolean available, double price) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.available = available;
        this.price = price;
    }
    public int getRoomNo(){
            return roomNo;
        }
    public String getRoomType(){
        return roomType;
    } 
    public boolean isAvailable(){
        return available;
    }
    public double getPrice(){
        return price;
    }
    public void setAvailable(boolean available){
        this.available= available;
    }

    public static void main(String[] args) {
        Room r1 = new Room(101, "Deluxe", true, 2500.00);
        r1.setAvailable(false);
        System.out.println(r1.getRoomNo());
        System.out.println(r1.isAvailable());
    }
}
