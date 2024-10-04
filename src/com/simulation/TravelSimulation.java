package com.simulation;

import com.vehicles.Vehicle;
import com.vehicles.VehicleUtility;
import com.vehicles.Boat;
import com.vehicles.Car;
import com.vehicles.Boat;
import com.vehicles.Airplane;

public class TravelSimulation {
    public static void main(String[] args) {


        // the boat travels 100km and information about the boat is printed
        boat.travel(100.0);
        printVehicleInformation(boat, "Boat");

        // the car travels 1000km and information about the car is printed
        car.travel(1000.0);
        printVehicleInformation(car, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        airplane.travel(10000.0);
        printVehicleInformation(airplane, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.AddFuel(120);
        car.AddFuel(40);
        airplane.AddFuel(50000);

        // Travel again
        // Boat
        boat.travel(100.0);
        printVehicleInformation(boat, "Boat");

        // Car
        car.travel(1000.0);
        printVehicleInformation(car, "Car");

        // Airplane
        airplane.travel(10000.0);
        printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }

}
