package entities;

public class LegalEntity extends TaxPayer {
    private Integer numberEmployee;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer numberEmployee) {
        super(name, annualIncome);
        this.numberEmployee = numberEmployee;
    }

    public Integer getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Integer numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    @Override
    public double totalTaxPayer() {
        double percentTax = 0.16;
        if(numberEmployee > 10) {
            percentTax = 0.14;
        }

        return annualIncome * percentTax;
    }
}
