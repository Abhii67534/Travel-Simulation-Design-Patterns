package com.vehicles;
import java.text.DecimalFormat;
public class VehicleUtility {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {

        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " +df.format(vehicle.getDistance(vehicleType))  + "km");
        System.out.println("Travel Time: " + df.format(vehicle.getTime(vehicleType)) + " hours");
        System.out.println("Current Fuel Level: " + vehicle.getFuelLevel(vehicleType) + "L");
        System.out.println("Fuel Cost: $" + df.format(vehicle.getFuelCost(vehicleType)));
        System.out.println();
    }
}
