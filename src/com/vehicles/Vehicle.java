package com.vehicles;

import java.util.Objects;

public class Vehicle {
    Boat boat = new Boat();
    Car car = new Car();
    Airplane airplane = new Airplane();

    public void addFuel(String vehicleName , double amount) {
        // == checks the reference equality in java.so cant use that...equals() use value equality
      do{
          if(vehicleName.equals("boat")){
              boat.boatAddFuel(amount);
          };
          if(vehicleName.equals("car")){
              car.carAddFuel(amount);
          }
          if(vehicleName.equals("airplane")){
              airplane.airplaneAddFuel(amount);
          }
      }while(!vehicleName.equals("boat") && !vehicleName.equals("car") && !vehicleName.equals("airplane"));
    };

    public double getDistance(String vehicleName){
        boolean b = !vehicleName.equals("boat") && !vehicleName.equals("car") && !vehicleName.equals("airplane");
        do{
            if(vehicleName.equals("boat")){
               return boat.getBoatDistance();
            };
            if(vehicleName.equals("car")){
               return car.getCarDistance();
            }
            if(vehicleName.equals("airplane")){
               return airplane.getAirplaneDistance();
            }
        }while( b== true);
    }
};



public class VehicleUtility {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
//        System.out.println("Vehicle Type: " + vehicleType);
//        System.out.println("Travel Distance: " + /*...*/ + "km");
//        System.out.println("Travel Time: " + /*...*/ + " hours");
//        System.out.println("Current Fuel Level: " + /*...*/ + "L");
//        System.out.println("Fuel Cost: $" + /*...*/);
//        System.out.println();
    }
}