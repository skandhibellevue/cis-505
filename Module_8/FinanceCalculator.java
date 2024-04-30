public class FinanceCalculator {

    // Private parameters
    private static  int MONTHS_IN_YEAR = 12;

    /**
     * calculateFutureValue method with three arguments, which is used to calculate present and future values
     * @param double monthlyPayment, double rate, int years
     * @return double, future value
     */
    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int numberOfMonths = years * MONTHS_IN_YEAR;
        double interestRate = (1 + rate/100);
        double presentValue = monthlyPayment * numberOfMonths;
        return presentValue * (Math.pow(interestRate, numberOfMonths));
    } // calculateFutureValue
} // FinanceCalculator
