package entities;

public class Employeed {
    private Integer id;
    private String name;
    private Double salary;

    public Employeed(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public Double calculatePercentage(Double percentage) {
        return percentage / 10.0;
    }

    public Double calculate(Double percentage) {
        return (salary * calculatePercentage(percentage)) + salary;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary) ;
    }

}
