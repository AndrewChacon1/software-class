package c;

public class HybridVehicile implements GasolineVehicle, ElectricVehicile {
    private double gasInGallons;
    private double elecKilowats;

    public HybridVehicile(double gasInGallons, double elecKilowats) {
        this.gasInGallons = gasInGallons;
        this.elecKilowats = elecKilowats;
    }

    public double calcFuel(double fuel, double gallons) {
        return fuel * gallons;
    }

    public double calcCharge(double charge, double kilowats) {
        return charge * kilowats;
    }

    public double totalCost(double fuel, double charge) {
        return calcFuel(fuel, charge) + calcCharge(charge, elecKilowats);
    }
}