import java.io.Serializable;

public class Customer implements Serializable {
    private int accountNumber;
    private Account account;
    private String name;

    // Constructor
    public Customer (int accountNumber, String accountName, Account account) {
        this.accountNumber = accountNumber;
        this.name = accountName;
        this.account = account;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer ID: " + accountNumber + ", Customer Name: " + name + ", Account Name: " + this.account.getAccountName();
    }
}