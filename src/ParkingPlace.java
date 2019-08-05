public class ParkingPlace {
    private int placeNumber;
    private boolean isFree;


    public ParkingPlace(int placeNumber, boolean isFree) {
        this.placeNumber = placeNumber;
        this.isFree = isFree;
    }

    public int getPlaceNumber() {
        return this.placeNumber;
    }

    public boolean getIsFree() {
        return this.isFree;
    }

    public void setFree() {
        this.isFree = true;
    }

    public void setUse() {
        this.isFree = false;
    }
    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }
}
