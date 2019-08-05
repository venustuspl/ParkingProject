import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ParkingPlace place1 = new ParkingPlace(1, false);
        ParkingPlace place2 = new ParkingPlace(2, false);
        ParkingPlace place3 = new ParkingPlace(3, false);

        List<ParkingPlace> parkingPlaceList = new ArrayList<>();
        parkingPlaceList.add(place1);
        parkingPlaceList.add(place2);
        parkingPlaceList.add(place3);

        Parking parking1 = new Parking("Warszawa downtown", parkingPlaceList);
        //System.out.println(place1.getPlaceNumber() + " " + place1.getIsFree());


        Ticket ticket1 = parking1.getTicket();

        Scanner scanner = new Scanner(System.in);
        parking1.showParkingPlaces(parkingPlaceList);

        System.out.println("Podaj dowolną liczbę \"godzin\" ile parkował samochód: ");
        scanner.nextInt();

        if (ticket1!=null) {
            System.out.println(ticket1.getTime());
            System.out.println(ticket1.getParkingPlaceNumber());
            System.out.println(parking1.getCosts(ticket1));
        }


        parking1.showParkingPlaces(parkingPlaceList);


        System.out.println("");

        System.out.println("Koniec programu.");


    }
}
