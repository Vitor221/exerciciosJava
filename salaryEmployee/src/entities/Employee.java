package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        percentage /= 100;
        double newSalary = grossSalary * percentage;
        grossSalary += newSalary;
    }
}
