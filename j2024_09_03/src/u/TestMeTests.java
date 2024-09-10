package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe = new TestMe();
    }

	@Test
    public void squareTest() {
        double baseValue = 3.0;
        double expected = baseValue * baseValue;
        testMe.setValue(baseValue);
        double actual = testMe.square();
        assertEquals(expected, actual, 0.0001); // Using assertEquals for better precision comparison
    }

	// @Test
	// public void ConstructorTest() {
	// 	TestMe tm = new TestMe();
	// 	assertTrue(1 != 1);
	// }
	// description should be less than 1 page

	@Test
    public void testCalcGasMPG() {
        hybrid.setMilesfromGas(300);
        hybrid.setGallonsfromGas(10);
        double expectedMPG = 30.0; // 300 miles / 10 gallons
        double actualMPG = hybrid.calcGasMPG();
        assertEquals(expectedMPG, actualMPG, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalcGasMPGWithZeroGallons() {
        hybrid.setMilesfromGas(300);
        hybrid.setGallonsfromGas(0); // should throw ArithmeticException
        hybrid.calcGasMPG();
    }

    @Test
    public void testCalcMPGe() {
        hybrid.setElectricMiles(150);
        hybrid.setTotalkWh(5);
        double expectedMPGe = (150 / 5) * 33.7; // (150 miles / 5 kWh) * 33.7
        double actualMPGe = hybrid.calcMPGe();
        assertEquals(expectedMPGe, actualMPGe, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalcMPGeWithZeroKWh() {
        hybrid.setElectricMiles(150);
        hybrid.setTotalkWh(0); // should throw ArithmeticException
        hybrid.calcMPGe();
    }

    @Test
    public void testSettersAndGetters() {
        hybrid.setMilesfromGas(300);
        hybrid.setGallonsfromGas(10);
        hybrid.setElectricMiles(150);
        hybrid.setTotalkWh(5);

        // Verifying if the values are correctly set
        assertEquals(300, hybrid.getMilesfromGas(), 0.0001);
        assertEquals(10, hybrid.getGallonsfromGas(), 0.0001);
        assertEquals(150, hybrid.getElectricMiles(), 0.0001);
        assertEquals(5, hybrid.getTotalkWh(), 0.0001);
    }

	// recompile code - run test 
	// javac -cp junit-4.13.2.jar "./src/c/TestMe.java" "./src/u/TestMeTests.java"
	// java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.TestMeTests

}