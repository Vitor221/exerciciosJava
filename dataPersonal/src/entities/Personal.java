package entities;

public class Personal {
    private double high;
    private char gender;

    public Personal(double high) {
        this.high = high;
    }
    public Personal(double high, char gender) {
        this.high = high;
        this.gender = gender;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
