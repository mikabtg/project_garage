import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/*
* Klassen Etagen und Spots haben momentan keine Verwendung, aber ich wollte die noch nicht löschen
*
* Änderungen seit dem letzten Update:
* -> Erstellung des Parkhauses incl Etagen und Parkplätzen geht jetzt, falls noch zeit ist, kommt bei der Etagen
* Anzahl noch ein Userinput hin
* -> Fahrzeuge können erstellt und angezeigt werden
* -> Fahrzeuge können mit Nummernschild gesucht werden (noch keine Parkplatz zuordnung)

* */





public class Garage2 {
// Arraylists and objects for multiple use


    static Parkhaus parkhaus1 = new Parkhaus("360 Parkhaus", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), new ArrayList<>());

    static ArrayList<Vehicle>vehicleArrayList = new ArrayList<>();
    static Etagen etagen = new Etagen(new ArrayList<Integer>());
    static Spots spots = new Spots(new ArrayList<Integer>());
    static Vehicle vehicle = new Vehicle("","","","");

// Scanner for String, Int and other inputs (for multiple use)
    static Scanner scanString = new Scanner(System.in);
    static Scanner scanInt = new Scanner(System.in);
    static  Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("""
                360 CONSULTING
                CARPARK-PlANER""");
        menu();
    }

//menue methode
    public static void menu() {
        System.out.println("""
                 MENU
                 1 - Create garage
                 2 - Create vehicle
                 3 - Assign vehicle
                 4 - Search vehicle
                 5 - Show garage
                 6 - Show free space
                 7 - Delete vehicle
                 8 - Delete garage space
                 9 - Leave carpark
                Please selcet a nummber between 1-9
                """);
        String userinput = scanString.nextLine();
        switch (userinput) {
            case "1" -> createGarage();
            case "2" -> createVehicle();
            case "3" -> assignVehicle();
            case "4" -> searchVehicle();
            case "5" -> showGarage();
            case "6" -> freeSpace();
            case "7" -> deleteVehicle();
            case "8" -> deleteSpace();
            case "9" -> {
                System.out.println("You left the carpark");
                scan.close();
                System.exit(0);
            }
            default -> {
                System.out.println("Wrong input, please try again!");
                menu();
            }
        }
    }

// finished (maybe add userinput for levelcount as well)
    public static void createGarage(){
        System.out.println("Please enter the number of parkingspots for " + (long) parkhaus1.getEtagenP().size() +" level:");
        for (int i = 1; i <= parkhaus1.getEtagenP().size(); i++){
            System.out.println("Enter the number of parking spots for level "+i+":");
            ArrayList<Integer> spotRef = new ArrayList<>();
            int user = scanInt.nextInt();
            for(int j = 1; j <= user; j++){
                spotRef.add(j);
            }
            spots.setParkingspotArraylist(spotRef);
            System.out.println("Level "+i+ " has now " + (long) spotRef.size() + " parking spots\n");
        }
        menu();
    }

// finished (???)
    public static void createVehicle(){
        vehicleArrayList.add(vehicle);
        System.out.println("Enter the plate number of your vehicle:");
        vehicle.setPlateNo(scanString.nextLine());
        System.out.println("Enter the type (car or motorbike) of your vehicle:");
        vehicle.setType(scanString.nextLine());
        System.out.println("Enter the brand of your vehicle:");
        vehicle.setBrand(scanString.nextLine());
        System.out.println("Enter the color of your vehicle:");
        vehicle.setColor(scanString.nextLine());
        System.out.println("Your vehicle\nPlate no.: "+vehicle.getPlateNo()+"\n" +
                "Type: "+vehicle.getType()+"\n"+
                "Brand: "+ vehicle.getBrand()+"\n"+
                "Colour: "+vehicle.getColor()+"\n");
//request for a new vehicle or return to menu
        vehicleInput();
    }

// finished
    public static void vehicleInput(){
        System.out.println("Do you want to add another vehicle?(Y/N)");
        String userinput = scanString.nextLine().toUpperCase();
        if (userinput.equals("Y")) {
            createVehicle();
        } else if (userinput.equals("N")) {
            menu();
        } else {
            System.out.println("Wrong input, please try again!");
            vehicleInput();
        }
    }

    public static void assignVehicle(){
        //assign the created vehicle to a specific parking spot xy
        //check if there is a free spot available
        //if not, decline

    }

// still needs the assign parkingspot
    public static void searchVehicle() {
        ArrayList<Vehicle> searchVehicle = new ArrayList<>();
        System.out.println("Please enter the license plate for the vehicle you are looking for:");
        String userInput = scanString.nextLine();
        for (Vehicle search : vehicleArrayList) {
            if (vehicle.getPlateNo().equals(userInput)) {
                searchVehicle.add(search);
            }
            else {
                System.out.println("Wrong input, please try again");
                searchVehicle();
            }
        }

        for (Vehicle search2 : searchVehicle) {
            System.out.println("Your vehicle\nPlate no.: "+search2.getPlateNo()+"\n" +
                    "Type: "+search2.getType()+"\n"+
                    "Brand: "+ search2.getBrand()+"\n"+
                    "Colour: "+search2.getColor()+"\n");
        }

    }

    public static void showGarage() {
        //show the complete carpark with all vehicles in it

    }

    public static void freeSpace() {
            System.out.println("Please select a level to show free parking spots");
            int userInput = scanInt.nextInt();
            //show possible free space
    }

    public static void deleteVehicle() {
        System.out.println("Please enter the plate number for the vehicle you want to delete:");
        String userInput = scanString.nextLine();
        //delete a specific vehicle from its spot

    }

    public static void deleteSpace() {
        System.out.println("Which level do you want to delete?");
        int userInputL = scanInt.nextInt();
       // etagenArrayList.remove(userInputL);

        //delete a level or parking spot (always the last one)
    }

}