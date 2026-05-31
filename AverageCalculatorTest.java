// AverageCalculatorTest.java
// JUnit test class for AverageCalculator
// Tests verify correct averag calculation for basic, single-element, and larger arrays

import org.junit.Test;
import static org.junit.Assert.*;

public class AverageCalculatorTest {

    //Instance of AverageCalculator to use in tests
    AverageCalculator calc = new AverageCalculator();

    // Test average of a basic 3-number array
    @Test
    public void testBasicAverage() {
        int[] nums = {10, 20, 30};
        assertEquals(20.0, calc.calculateAverage(nums), 0.001);
    }

    // Test that a single-element array returns that element as the average
    @Test
    public void testSingleNumber() {
        int[] nums = {42};
        assertEquals(42.0, calc.calculateAverage(nums), 0.001);
    }

    // Test average of a larger 5-number array
    @Test
    public void testLargerSet() {
        int[] nums = {10, 20, 30, 40, 50};
        assertEquals(30.0, calc.calculateAverage(nums), 0.001);
    }
}