import java.util.ArrayList;

public class Spots {

    public ArrayList<Integer> parkingspotArraylist = new ArrayList<>();

//Konstruktor
    Spots(ArrayList<Integer> parkingSpot){
        this.parkingspotArraylist = parkingSpot;}


//Getter & Setter

    public ArrayList<Integer> getParkingspotArraylist() {
        return parkingspotArraylist;
    }

    public void setParkingspotArraylist(ArrayList<Integer> parkingspotArraylist) {
        this.parkingspotArraylist = parkingspotArraylist;}

}

