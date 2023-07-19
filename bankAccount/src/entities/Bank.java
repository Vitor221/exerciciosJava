package entities;

public class Bank {

    private int accountNumber;
    private String accountName;
    private double accountValue;
    private final double tax = 5.0;

    public Bank() {

    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void addDeposit(double deposit) {
        accountValue += deposit;
    }

    public void withdrawValue(double deposit) {
        accountValue -= deposit + tax;
    }

    public String toString() {
        return "Account " + accountNumber + ", Holder: " + accountName + ", Balance: $ " + String.format("%.2f", accountValue);
    }
}
