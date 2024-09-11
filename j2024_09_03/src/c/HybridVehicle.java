package c;

public class HybridVehicle implements GasolineInterface, ElectricInterface {

    private double fuelCapacity;
    private double electricCapacity;

    public HybridVehicle(double fuelCapacity, double electricCapacity) {
        this.fuelCapacity = fuelCapacity;
        this.electricCapacity = electricCapacity;
    }

    @Override
    public double fuelCost(double pricePerGallon, double gallons) {
        return pricePerGallon * Math.min(gallons, fuelCapacity);
    }

    @Override
    public double chargeCost(double pricePerKWh, double kWh) {
        return pricePerKWh * Math.min(kWh, electricCapacity);
    }

    public double totalCost(double pricePerGallon, double gallons, double pricePerKWh, double kWh) {
        return fuelCost(pricePerGallon, gallons) + chargeCost(pricePerKWh, kWh);
    }
}
