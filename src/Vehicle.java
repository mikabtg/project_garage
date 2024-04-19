public class Vehicle extends Garage {
//Attribute
    private String plateNo;
    private String type;
    private String brand;
    private String color;

//Konstruktor
Vehicle (int level, int parkingSpot, String plateNo, String type, String brand, String color){
    super(level, parkingSpot);
    this.plateNo = plateNo;
    this.type = type;
    this.brand = brand;
    this.color = color;
}

//Getter & Setter
    public String getPlateNo() {
        return plateNo;
    }
    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
