/*
 * Name: Abhishek Sharma
 * ID: 131719176
 * Description:
 * The AirplaneAdapter class implements the IVehicle interface, allowing
 * an Airplane object to be used in contexts expecting an IVehicle.
 * It delegates calls to the underlying Airplane instance for methods
 * related to fuel management and travel details.
 */


public class AirplaneAdapter implements IVehicle{
    private Airplane airplane;

    public AirplaneAdapter(){
        this.airplane = new Airplane();
    }
    @Override
    public void addFuel(double amount){
        airplane.airplaneAddFuel(amount);
    }

    @Override
    public double vehicleDistance() {
        return airplane.getAirplaneDistance();
    }

    @Override
    public double vehicleTime() {
        return airplane.getAirplaneTime();
    }

    @Override
    public double fuelLevel() {
        return airplane.getAirplaneFuelLevel();
    }

    @Override
    public double fuelCost() {
        return airplane.getAirplaneFuelCost();
    }

    @Override
    public void vehicleTravel(double distance) {
        airplane.airplaneTravel(distance);
    }
}
