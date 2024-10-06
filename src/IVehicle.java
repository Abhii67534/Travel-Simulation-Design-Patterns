/*
 * Name: Mubassir Mohmed Sapa
 * ID: 118160225
 * Description:
 * The IVehicle interface defines methods for vehicle operations,
 * including fuel management, travel tracking, and distance calculations.
 * Implementing classes must provide these functionalities.
 */

public interface IVehicle {
    void addFuel(double amount);
    double vehicleDistance();
    double vehicleTime();
    double fuelLevel();
    double fuelCost();
    void vehicleTravel(double distance);
}
