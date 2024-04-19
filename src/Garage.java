public class Garage {
//Attribute
    public int level;
    public int parkingSpot;

//Konstruktor
    Garage(int level, int parkingSpot){
    this.level = level;
    this.parkingSpot = parkingSpot;
    }

//Getter & Setter
    public int getLevel() {
        return level;
    }
    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
