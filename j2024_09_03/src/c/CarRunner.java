public class CarRunner {

    public static void main(String[] args) {
        // Create an instance of the Hybrid class
        Hybrid hybrid = new Hybrid();
        
        // Example data for fully gas mode
        double gasMiles = 300;
        double gasGallons = 10;
        
        // Example data for fully electric mode
        double electricMiles = 300;
        double kWh = 70;
        
        // Set values for gas mode
        hybrid.setMilesfromGas(gasMiles);
        hybrid.setGallonsfromGas(gasGallons);
        
        // Calculate MPG in fully gas mode
        double gasMPG = hybrid.calcGasMPG();
        System.out.printf("MPG in fully gas mode: %.2f MPG%n", gasMPG);
        
        // Set values for electric mode
        hybrid.setElectricMiles(electricMiles);
        hybrid.setTotalkWh(kWh);
        
        // Calculate MPGe in fully electric mode
        double electricMPGe = hybrid.calcMPGe();
        System.out.printf("MPGe in fully electric mode: %.2f MPGe%n", electricMPGe);
        
        // Calculate average MPG for hybrid mode (assuming 50% of miles in gas mode and 50% in electric mode)
        double halfMiles = gasMiles / 2;
        double halfGallons = gasGallons / 2;
        double halfkWh = kWh / 2;
        
        hybrid.setMilesfromGas(halfMiles);
        hybrid.setGallonsfromGas(halfGallons);
        hybrid.setElectricMiles(halfMiles);
        hybrid.setTotalkWh(halfkWh);
        
        // Calculate average MPG for hybrid mode
        double hybridMPG = (hybrid.calcGasMPG() + hybrid.calcMPGe()) / 2;
        System.out.printf("Average MPG in hybrid mode: %.2f MPG%n", hybridMPG);
        
        // Cost calculations
        double gasCostPerGallon = 3.50;
        double kWhCostPerkWh = 0.24;
        
        double totalGasCost = gasGallons * gasCostPerGallon;
        double totalElectricCost = kWh * kWhCostPerkWh;
        
        System.out.printf("Total cost of gasoline: $%.2f%n", totalGasCost);
        System.out.printf("Total cost of electricity: $%.2f%n", totalElectricCost);
    }
}
