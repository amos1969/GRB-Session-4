package salary;

public class Person {
    String name;
    double baseSalary;
    int numberOfSales;
    double commissionRate;
    double totalSalary;
    SalaryCalculator salaryCalc;

    public Person(String name, double baseSalary, int numberOfSales, double commissionRate) {
        this.salaryCalc = new SalaryCalculator();
        this.name = name;
        this.baseSalary = baseSalary;
        this.numberOfSales = numberOfSales;
        this.commissionRate = commissionRate;
        this.totalSalary = 0.0;
        calculateSalary();
    }

    public void calculateSalary() {
        this.totalSalary = salaryCalc.getTotalSalary(this.baseSalary, this.numberOfSales, this.commissionRate);
    }

    public String getTotalSalary() {
        // Use String.format(...) to get nicely formatted money to 2dp
        return "Total salary for " + this.name + ": £" + String.format("%.2f", this.totalSalary);
    }
}
