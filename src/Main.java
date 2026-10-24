import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Check-In Date(YYYY-MM-DD): ");
    String i= sc.nextLine();
    LocalDate in = LocalDate.parse(i);
    System.out.println("Enter Check-Out Date(YYYY-MM-DD): ");
    String o = sc.nextLine();
    LocalDate out = LocalDate.parse(o);
    if(in.isBefore(LocalDate.now())||out.isBefore(in)||out.isEqual(in)){
        System.out.println("Invalid Date range!");
    }else{
        long night = ChronoUnit.DAYS.between(in, out);
        System.out.println("Total Nights = "+night);   
    }
    Hotel hotel = new Hotel();
    hotel.displayAvailableRooms();
    System.out.println("Enter Guest ID: ");
    int id=sc.nextInt();
    System.out.println("Enter Guest Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Room Number you want to Book: ");
}
}
