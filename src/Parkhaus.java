import java.util.ArrayList;

public class Parkhaus {
    ArrayList<Integer> etagenP = new ArrayList<>();
    ArrayList<String> vehicleP = new ArrayList<>();
    String parkhausName;

    //Konstrukter
    Parkhaus(String parkhausName, ArrayList<Integer> etagenP, ArrayList<String> vehicleP){
        this.parkhausName = parkhausName;
        this.etagenP = etagenP;
        this.vehicleP = vehicleP;
    }

    //Setter & Getter
    public void setEtagenP(ArrayList<Integer> etagenP) {
        this.etagenP = etagenP;
    }

    public void setParkhausName(String parkhausName) {
        this.parkhausName = parkhausName;
    }

    public void setVehicleP(ArrayList<String> vehicleP) {
        this.vehicleP = vehicleP;
    }

    public ArrayList<Integer> getEtagenP() {
        return etagenP;
    }

    public String getParkhausName() {
        return parkhausName;
    }

    public ArrayList<String> getVehicleP() {
        return vehicleP;
    }
}




