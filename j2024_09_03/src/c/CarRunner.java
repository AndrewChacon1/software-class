package c;

public class CarRunner {
    public static void main(String[] args) {
        // Instantiate the HybridVehicle
        HybridVehicle hybrid = new HybridVehicle(15.0, 50.0);

        // Set up gas and electric costs
        double gasCostPerGallon = 3.50;
        double electricCostPerKWh = 0.24;

        // Fully gas mode (example: 120 miles on 20 MPG)
        double miles = 120;
        double mpg = 20;
        double gasCost = (miles / mpg) * gasCostPerGallon;
        System.out.println("Cost in fully gas mode for 120 miles: $" + gasCost);

        // Fully electric mode (example: 300 miles on 70 kWh)
        double milesElectric = 300;
        double kWhUsed = 70;
        double mpge = milesElectric / kWhUsed * 33.7;
        double electricCost = (kWhUsed * electricCostPerKWh);
        System.out.println("Cost in fully electric mode for 300 miles: $" + electricCost);
        System.out.println("MPGe for 300 miles: " + mpge + " MPGe");

        // Half-gas/half-electric hybrid mode
        double averageMPG = (mpg + mpge) / 2;
        System.out.println("Average MPG in hybrid mode: " + averageMPG);
    }
}
