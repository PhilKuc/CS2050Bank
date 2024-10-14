import java.io.Serializable;
import java.util.Random;

public class Savings extends Account implements Serializable {
    private double interestRate;

    //onstructor that generates an account number
    public Savings(String accountName, double balance, double interestRate) {
        super(generateAccountNumber(), accountName, balance);  // Call to the parent class with a generated account number
        this.interestRate = interestRate;
    }

    // Generates  account number
    private static int generateAccountNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;  // Generate a 6-digit account number as an integer
    }

    // Getter and Setter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate;
    }
}