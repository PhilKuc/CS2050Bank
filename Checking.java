import java.io.Serializable;
import java.util.Random;

public class Checking extends Account implements Serializable {
    private double draftlimit;

    // Default constructor
    public Checking() {
        super(generateAccountNumber(), "Default Name", 0.0);  // Modify the default name and balance if needed
        this.draftlimit = 0.0;  // Default value for draft limit
    }

    // Constructor with parameters
    public Checking(double draftlimit, double balance, String accountName) {
        super(generateAccountNumber(), accountName, balance);  // Generate account number
        this.draftlimit = draftlimit;
    }

    // Generates a random 6-digit account number
    private static int generateAccountNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }

    // Getter and Setter for draft limit
    public double getDraftlimit() {
        return draftlimit;
    }

    public void setDraftlimit(double draftlimit) {
        this.draftlimit = draftlimit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Draft Limit: " + draftlimit;
    }
}