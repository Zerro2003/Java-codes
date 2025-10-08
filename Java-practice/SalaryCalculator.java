public class SalaryCalculator {
    public static void main(String[] args) {
        double basicSalary = 2500;
        double bonus = 500;
        double taxRate = 0.10;

        double grossSalary = basicSalary + bonus;
        double taxDeduction = grossSalary * taxRate;
        double netSalary = grossSalary - taxDeduction;

        System.out.println("--- Employee Salary Details ---");
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("---------------------------------");
        System.out.println("Gross Salary (Basic + Bonus): $" + grossSalary);
        System.out.println("Tax Deduction (10%): $" + taxDeduction);
        System.out.println("---------------------------------");
        System.out.println("Net Salary (Gross - Deduction): $" + netSalary);
    }
}