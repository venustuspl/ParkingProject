import java.time.LocalTime;

public class Ticket {
    //private int id;
    private LocalTime time;
    private int  parkingPlaceNumber;

    public Ticket(LocalTime time, ParkingPlace parkingPlace) {

        this.time = time;
        this.parkingPlaceNumber = parkingPlace.getPlaceNumber();
    }

    public LocalTime getTime() {
        return this.time;
    }

    public int getParkingPlaceNumber(){
        return this.parkingPlaceNumber;
    }

    public Ticket(){
        System.out.println("Nie ma miejsc");

    }


}
