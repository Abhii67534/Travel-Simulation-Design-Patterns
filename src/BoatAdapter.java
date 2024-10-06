/*
 * Name: Abhishek Sharma
 * ID: 131719176
 * Description:
 * The BoatAdapter class implements the IVehicle interface, allowing a
 * Boat object to be used in contexts expecting an IVehicle. It
 * delegates calls to the underlying Boat instance for methods
 * related to fuel management and travel details.
 */

public class BoatAdapter implements IVehicle {

    private Boat boat;

    public BoatAdapter(){
        this.boat = new Boat();
    }
    @Override
    public void addFuel(double amount){
        boat.boatAddFuel(amount);
    }

    @Override
    public double vehicleDistance() {
        return boat.getBoatDistance();
    }

    @Override
    public double vehicleTime() {
        return boat.getBoatTime();
    }

    @Override
    public double fuelLevel() {
        return boat.getBoatFuelLevel();
    }

    @Override
    public double fuelCost() {
        return boat.getBoatFuelCost();
    }

    @Override
    public void vehicleTravel(double distance) {
        boat.boatTravel(distance);
    }
}
