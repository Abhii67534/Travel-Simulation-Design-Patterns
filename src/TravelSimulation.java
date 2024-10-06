/*
 * Name: Mubassir Mohmed Sapa
 * ID: 118160225
 * Description:
 * This program simulates the travel of different types of vehicles (car, boat, airplane).
 * Each vehicle can travel a specified distance, print its information, and manage fuel levels.
 * The simulation demonstrates the traveling capabilities of each vehicle, adding fuel,
 * and then traveling again to show how fuel impacts the distance they can travel.
 */

public class TravelSimulation {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("car");
        Vehicle boat = new Vehicle("boat");
        Vehicle airplane = new Vehicle("airplane");


        // the boat travels 100km and information about the boat is printed
        boat.vehicleTravel(100.0);
        boat.printVehicleInformation(boat, "boat");


        // the car travels 1000km and information about the car is printed
        car.vehicleTravel(1000.0);
       car.printVehicleInformation(car, "car");

        // the airplane travels 10000km and information about the airplane is printed
        airplane.vehicleTravel(10000.0);
       airplane.printVehicleInformation(airplane, "airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.addFuel( 120);
        car.addFuel(40);
        airplane.addFuel(50000);

        // Travel again
        // Boat
        boat.vehicleTravel(100.0);
        boat.printVehicleInformation(boat, "boat");

        // Car
        car.vehicleTravel(1000.0);
       car.printVehicleInformation(car, "car");

        // Airplane
        airplane.vehicleTravel(10000.0);
        airplane.printVehicleInformation(airplane, "airplane");

        new java.util.Scanner(System.in).nextLine();
    }

}
