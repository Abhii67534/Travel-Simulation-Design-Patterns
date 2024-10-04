package com.vehicles;

import java.util.Objects;

public class Vehicle {
    private Boat boat;
    private Car car;
    private Airplane airplane;
    public Vehicle(String name){
        if (name.equals("boat")) {
             boat = new Boat();

        }else if(name.equals("car")) {
             car = new Car();

        }else if(name.equals("airplane")) {
             airplane = new Airplane();

        }
    }


    public void addFuel(String vehicleName , double amount) {
        if (vehicleName == null) {
            throw new IllegalArgumentException("Vehicle name cannot be null.");
        }

          if(vehicleName.equals("boat")){
              boat.boatAddFuel(amount);
          }
          else if(vehicleName.equals("car")){
              car.carAddFuel(amount);
          }
          else if(vehicleName.equals("airplane")){
              airplane.airplaneAddFuel(amount);
          } else{
              throw new IllegalArgumentException("Vehicle name cannot be null.");
          }

    }

    public double getDistance(String vehicleName) {
        if (vehicleName == null) {
            throw new IllegalArgumentException("Vehicle name cannot be null.");
        }

        // Check each vehicle type and return the corresponding distance
        if (vehicleName.equals("boat")) {
            return boat.getBoatDistance();
        } else if (vehicleName.equals("car")) {
            return car.getCarDistance();
        } else if (vehicleName.equals("airplane")) {
            return airplane.getAirplaneDistance();
        } else {
            // Handle invalid vehicle name
            throw new IllegalArgumentException("Invalid vehicle name: " + vehicleName);
        }
    }

        public double getTime(String vehicleName){
            if (vehicleName == null) {
                throw new IllegalArgumentException("Vehicle name cannot be null.");
            }

            // Check each vehicle type and return the corresponding distance
            if (vehicleName.equals("boat")) {
                return boat.getBoatTime();
            } else if (vehicleName.equals("car")) {
                return car.getCarTime();
            } else if (vehicleName.equals("airplane")) {
                return airplane.getAirplaneTime();
            } else {
                // Handle invalid vehicle name
                throw new IllegalArgumentException("Invalid vehicle name: " + vehicleName);
            }

        }

        public double getFuelLevel(String vehicleName){
            if (vehicleName == null) {
                throw new IllegalArgumentException("Vehicle name cannot be null.");
            }

            // Check each vehicle type and return the corresponding distance
            if (vehicleName.equals("boat")) {
                return boat.getBoatFuelLevel();
            } else if (vehicleName.equals("car")) {
                return car.getCarFuelLevel();
            } else if (vehicleName.equals("airplane")) {
                return airplane.getAirplaneFuelLevel();
            } else {
                // Handle invalid vehicle name
                throw new IllegalArgumentException("Invalid vehicle name: " + vehicleName);
            }
        }

        public double getFuelCost(String vehicleName){
            if (vehicleName == null) {
                throw new IllegalArgumentException("Vehicle name cannot be null.");
            }

            // Check each vehicle type and return the corresponding distance
            if (vehicleName.equals("boat")) {
                return boat.getBoatFuelCost();
            } else if (vehicleName.equals("car")) {
                return car.getCarFuelCost();
            } else if (vehicleName.equals("airplane")) {
                return airplane.getAirplaneFuelCost();
            } else {
                // Handle invalid vehicle name
                throw new IllegalArgumentException("Invalid vehicle name: " + vehicleName);
            }

        }

        public void Travel(String vehicleName, double distance){
            if (vehicleName == null) {
                throw new IllegalArgumentException("Vehicle name cannot be null.");
            }
            if (vehicleName.equals("boat")) {
                 boat.boatTravel(distance);
            } else if (vehicleName.equals("car")) {
                 car.carTravel(distance);
            } else if (vehicleName.equals("airplane")) {
                 airplane.airplaneTravel(distance);
            } else {
                // Handle invalid vehicle name
                throw new IllegalArgumentException("Invalid vehicle name: " + vehicleName);
            }
        }
};



