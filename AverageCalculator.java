// AverageCalculator.java
// This program calculates the average of an array of integers using a resuable method.
// A Junit test file (AverageCalculatorTest.java) verifies the method with multiple assertions

public class AverageCalculator {
    // Calculates the average of an array of integers
    public double calculateAverage(int[] numbers) {
        int sum = 0;

        // Loop through each number and add to sum
        for (int num : numbers) {
            sum += num;
        }

        // Cast sum to double ebfore dividing to avoid integer division
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        AverageCalculator calc = new AverageCalculator();

        // Sample array to test the method manually
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("Average: " + calc.calculateAverage(nums));
    }
}