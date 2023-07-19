package util;

public class CurrencyConverter {

    public static final double TAX_IOF = 0.06;

    public static double convertInReal(double dollarRate, double valueBuyDolar) {
        double valueNotImpost = dollarRate * valueBuyDolar;
        double valueInImpost = valueNotImpost * TAX_IOF;

        return valueNotImpost + valueInImpost;
    }

}
