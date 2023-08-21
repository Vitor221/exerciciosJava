package entities;

public class Individuals extends TaxPayer {
    private Double healthSpending;

    public Individuals() {
        super();
    }

    public Individuals(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double totalTaxPayer() {
        double percentTax = 0.0;
        if(annualIncome < 20000.00) {
            percentTax = 0.15;
        } else if(annualIncome > 20000.00) {
            percentTax = 0.25;
        }

        return (annualIncome * percentTax) - (healthSpending * 0.50);
    }
}
