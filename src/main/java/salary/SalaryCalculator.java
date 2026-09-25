package salary;

public class SalaryCalculator { // only give bonus when sales exceed 500:
    boolean taxYearEnded = true;
    double bonus = 1000;

    public double getTotalSalary(double baseSalary, int numberOfSales, double commissionRate) {
        if (taxYearEnded) {
            double totalSalary = baseSalary + (numberOfSales * commissionRate);

            // only give bonus when sales exceed 500:
            if (numberOfSales > 500) {
                totalSalary += bonus;
            }
            return totalSalary;
        }
        // If the tax year hasn't ended return 0.0
        return 0.0;
    }
}
