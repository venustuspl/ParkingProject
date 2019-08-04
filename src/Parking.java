import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String name;
    List<ParkingPlace> parkingPlaceList = new ArrayList<>();
    private final double firstHourCost = 10;
    private final double moreThanOneHourCost = 8;

    public Parking(String name, List parkingPlaceList) {
        this.name = name;
        this.parkingPlaceList = parkingPlaceList;
    }


    public Ticket getTicket() {

        ParkingPlace parkingPlace = null;
        for (ParkingPlace entry : this.parkingPlaceList) {
            //System.out.println(entry.getPlaceNumber());
            if (entry.getIsFree()) {
                parkingPlace = entry;
                //System.out.println(entry.getPlaceNumber());
                parkingPlace.setFree(false);
                break;
            }
        }

        Ticket ticket;
        ticket = new Ticket(LocalTime.now(), parkingPlace);

        return ticket;
    }

    public double getCosts(Ticket ticket) {
        //private int parkingStart = ticket.getStartTime();
        long hours = Duration.between(ticket.getTime(), LocalTime.now()).toSeconds();
        System.out.println(hours);
        if (hours <= 1) {
            return hours * firstHourCost;
        } else {

            return hours * moreThanOneHourCost;
        }


    }

    public void setFreeParkingPlace(Ticket ticket) {

    }

    public void showParkingPlaces(List<ParkingPlace> parking){

        for (ParkingPlace place : parking){
            System.out.println(place.getPlaceNumber() + " " + place.getIsFree());

        }
    }
}
