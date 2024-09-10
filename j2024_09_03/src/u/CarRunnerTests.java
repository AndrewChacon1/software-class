package u;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class CarRunnerTests {

    @Test
    public void testRunCalculations() {
        // Create a mock Hybrid object
        Hybrid hybrid = Mockito.mock(Hybrid.class);

        // Define behavior for mock object
        Mockito.when(hybrid.calcGasMPG()).thenReturn(30.0);
        Mockito.when(hybrid.calcMPGe()).thenReturn(144.43);

        // Call the method under test
        CarRunner.runCalculations(hybrid, 300, 10, 300, 70);

        // Verify interactions and results
        Mockito.verify(hybrid).setMilesfromGas(300);
        Mockito.verify(hybrid).setGallonsfromGas(10);
        Mockito.verify(hybrid).setElectricMiles(300);
        Mockito.verify(hybrid).setTotalkWh(70);
        
        // Additional assertions can be added here if needed
    }
}