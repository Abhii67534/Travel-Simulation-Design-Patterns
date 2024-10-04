package com.simulation;

import com.vehicles.Vehicle;
import com.vehicles.VehicleUtility;

public class TravelSimulation {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("car");
        Vehicle boat = new Vehicle("boat");
        Vehicle airplane = new Vehicle("airplane");


        // the boat travels 100km and information about the boat is printed
        boat.Travel("boat",100.00);
          VehicleUtility.printVehicleInformation(boat, "boat");
//

        // the car travels 1000km and information about the car is printed
        car.Travel("car",1000.0);
       VehicleUtility.printVehicleInformation(car, "car");

        // the airplane travels 10000km and information about the airplane is printed
        airplane.Travel("airplane",10000.0);
       VehicleUtility.printVehicleInformation(airplane, "airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.addFuel("boat", 120);
        car.addFuel("car",40);
        airplane.addFuel("airplane",50000);

        // Travel again
        // Boat
        boat.Travel("boat",100.0);
        VehicleUtility.printVehicleInformation(boat, "boat");
//
        // Car
        car.Travel("car",1000.0);
       VehicleUtility.printVehicleInformation(car, "car");
//
        // Airplane
        airplane.Travel("airplane",10000.0);
        VehicleUtility.printVehicleInformation(airplane, "airplane");

        new java.util.Scanner(System.in).nextLine();
    }

}
