/*
 * Name: Abhishek Sharma
 * ID: 131719176
 * Description:
 * The Vehicle class acts as a wrapper for different types of vehicles
 * (boat, car, airplane) using the IVehicle interface. It allows for
 * easy management of vehicle actions such as adding fuel, traveling,
 * and retrieving information like distance, fuel level, and travel time.
 * The class uses the Adapter pattern to create instances of specific
 * vehicle adapters based on the provided vehicle name.
 */


import java.text.DecimalFormat;

public class Vehicle {
    private final IVehicle vehicle;
    public Vehicle(String name) {
        if (name.equals("boat")) {
            vehicle = new BoatAdapter();
        } else if (name.equals("car")) {
            vehicle = new CarAdapter();
        } else if (name.equals("airplane")) {
            vehicle = new AirplaneAdapter();
        } else {
            throw new IllegalArgumentException("Invalid vehicle name: " + name);
        }
    }
    public void addFuel(double amount) {
        vehicle.addFuel(amount);
    }

    public void vehicleTravel(double distance) {
        vehicle.vehicleTravel(distance);
    }

    public double vehicleDistance() {
        return vehicle.vehicleDistance();
    }

    public double fuelLevel() {
        return vehicle.fuelLevel();
    }

    public double fuelCost() {
        return vehicle.fuelCost();
    }

    public double vehicleTime() {
        return vehicle.vehicleTime();
    }

    public void printVehicleInformation(Vehicle vehicle, String vehicleType) {

        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " +df.format(vehicle.vehicleDistance())  + "km");
        System.out.println("Travel Time: " + df.format(vehicle.vehicleTime()) + " hours");
        System.out.println("Current Fuel Level: " + vehicle.fuelLevel() + "L");
        System.out.println("Fuel Cost: $" + df.format(vehicle.fuelCost()));
        System.out.println();
    }
};



