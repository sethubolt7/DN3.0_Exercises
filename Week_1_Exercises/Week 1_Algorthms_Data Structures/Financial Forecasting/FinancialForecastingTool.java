public class FinancialForecastingTool {

    /**
     * Calculate the future value based on the recursive approach.
     *
     * @param currentValue The current value of the investment.
     * @param growthRate The annual growth rate (as a decimal, e.g., 0.05 for 5%).
     * @param years The number of years into the future.
     * @return The future value of the investment.
     */
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base case: if no years are left, return the current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: calculate future value for the remaining years
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        FinancialForecastingTool tool = new FinancialForecastingTool();
        double currentValue = 1000.0; // Example current value
        double growthRate = 0.05; // Example growth rate (5%)
        int years = 10; // Example number of years into the future

        double futureValue = tool.calculateFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }
}
