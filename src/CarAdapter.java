/*
 * Name: Mubassir Mohmed Sapa
 * ID: 118160225
 * Description:
 * The CarAdapter class implements the IVehicle interface, allowing a
 * Car object to be used in contexts expecting an IVehicle. It
 * delegates calls to the underlying Car instance for methods
 * related to fuel management and travel details.
 */

public class CarAdapter implements IVehicle{
    private Car car;

    public CarAdapter(){
        this.car = new Car();
    }
    @Override
    public void addFuel(double amount){
        car.carAddFuel(amount);
    }

    @Override
    public double vehicleDistance() {
       return car.getCarDistance();
    }

    @Override
    public double vehicleTime() {
        return car.getCarTime();
    }

    @Override
    public double fuelLevel() {
        return car.getCarFuelLevel();
    }

    @Override
    public double fuelCost() {
        return car.getCarFuelCost();
    }

    @Override
    public void vehicleTravel(double distance) {
         car.carTravel(distance);
    }
}
