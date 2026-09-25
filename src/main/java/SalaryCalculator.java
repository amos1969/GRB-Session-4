public class SalaryCalculator { // only give bonus when sales exceed 500:
    boolean taxYearEnded = true;
    double bonus = 1000;

    public static void main(String[] args) {
        SalaryCalculator salaryCalc = new SalaryCalculator();

        // sales person 1
        double person1BaseSalary = 20000;
        int person1NumberOfSales = 1000;
        double person1CommissionRate = 3.0;
        double person1Salary = 0.0;
        if (salaryCalc.taxYearEnded) {
            person1Salary = salaryCalc.getTotalSalary(
                    person1BaseSalary,
                    person1NumberOfSales,
                    person1CommissionRate
            );
        }
        System.out.println("Total salary after bonus for Person 1: " + person1Salary);

        // sales person 2:
        double person2BaseSalary = 25000;
        int person2NumberOfSales = 300;
        double person2CommissionRate = 2.0;
        double person2Salary= 0.0;
        if (salaryCalc.taxYearEnded) {
             person2Salary= salaryCalc.getTotalSalary(
                    person2BaseSalary,
                    person2NumberOfSales,
                    person2CommissionRate
            );
        }
        System.out.println("Total salary after bonus for Person 2: " + person2Salary);
    }

    private double getTotalSalary(double baseSalary, int numberOfSales, double commissionRate) {
        double totalSalary = baseSalary + (numberOfSales * commissionRate);

        // only give bonus when sales exceed 500:
        if (numberOfSales > 500) {
            totalSalary += bonus;
        }
        return totalSalary;
    }

}
