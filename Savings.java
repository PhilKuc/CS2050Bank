public class Savings extends Account {
    public double interestRate;

    //constructor
    public Savings(String accountNumber,String accountName, double balance, double interestRate) {
        super(accountNumber, accountName, balance );
        this.interestRate = interestRate;
    }
    //get and set interestrate
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
