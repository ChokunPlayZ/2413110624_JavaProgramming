package Lab6;

public class TestIncomeTaxCaluclator {
    public static void main(String args[]) {
        IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator();
        incomeTaxCalculator.setIncome(450000.0);
        incomeTaxCalculator.displayTaxDetails();
    }
}
