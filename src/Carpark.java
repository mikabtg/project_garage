import java.util.ArrayList;
import java.util.Scanner;

public class Carpark {
// Arraylists and objects for multiple use
    static ArrayList<Garage>garageArrayList = new ArrayList<>();
    static ArrayList<Vehicle>vehicleArrayList = new ArrayList<>();
    static Garage garage = new Garage(0,0);
    static Vehicle vehicle = new Vehicle(0,0,"","", "","");

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
                Bitte wählen sie zwischen 1-9 aus""");
        int userinput = scanInt.nextInt();
//PROBLEM: Bei Stringeingaben stürzt das Progamm ab, wird nicht abgefangen von default
        switch (userinput) {
            case 1 -> createGarage();
            case 2 -> createVehicle();
            case 3 -> assignVehicle();
            case 4 -> searchVehicle();
            case 5 -> showGarage();
            case 6 -> freeSpace();
            case 7 -> deleteVehicle();
            case 8 -> deleteSpace();
            case 9 -> {
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

    public static void createGarage(){
        //create outline of the carpark (with x-levels and y-parking spots)
        garageArrayList.add(garage);
        System.out.println("Enter the number of level:");
        garage.setLevel(scanInt.nextInt());
        for(int i = 1; i <= garage.level; i++){
            System.out.println("Enter the number of parking spots for level "+i+":");
            garage.setParkingSpot(scanInt.nextInt());
        }
        menu();
    }


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
// hier muss eine Unterscheidung zwischen belegt und nicht belegt rein
        System.out.println("Enter the car park level:");
        vehicle.setLevel(scanInt.nextInt());
        System.out.println("Enter the parking spot:");
        vehicle.setParkingSpot(scanInt.nextInt());
//Abfrage ob man noch eins machen will
        vehicleInput();
    }
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

    public static void searchVehicle() {
        System.out.println("Please enter the license plate for the vehicle you are looking for:");
        String userInput = scanString.nextLine();
        if (userInput == vehicle.getPlateNo()) {
            //Show the vehicle with parkingspot
        }
        else {//Wrong Input, please try again blablabal}
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
        garageArrayList.remove(userInputL);

        //delete a level or parking spot (always the last one)
    }

}