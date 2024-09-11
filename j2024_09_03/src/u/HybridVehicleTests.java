package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.HybridVehicle;

public class HybridVehicleTests {

    @Before
    public void setUp() {
        hybrid = new HybridVehicle(15.0, 50.0); 
    }

    @Test
    public void testFuelCost() {
        double pricePerGallon = 3.5;
        double gallons = 10.0;
        double expectedCost = 35.0;
        assertEquals(expectedCost, hybrid.fuelCost(pricePerGallon, gallons), 0.0001);
    }

    @Test
    public void testChargeCost() {
        double pricePerKWh = 0.15;
        double kWh = 40.0;
        double expectedCost = 6.0;
        assertEquals(expectedCost, hybrid.chargeCost(pricePerKWh, kWh), 0.0001);
    }

    @Test
    public void testTotalCost() {
        double pricePerGallon = 3.5;
        double gallons = 10.0;
        double pricePerKWh = 0.15;
        double kWh = 40.0;
        double expectedCost = 41.0;
        assertEquals(expectedCost, hybrid.totalCost(pricePerGallon, gallons, pricePerKWh, kWh), 0.0001);
    }
}
