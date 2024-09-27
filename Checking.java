public  class Checking extends Account {
    public double draftlimit;


    //constructor
    public Checking(double draftlimit,double balance, String accountName, String accountNumber) {
        super(accountNumber, accountName, balance);
        this.draftlimit = draftlimit;
    }

    //get and set
    public double getDraftlimit() {
        return draftlimit;
    }

    public void setDraftlimit(double draftlimit) {
        this.draftlimit = draftlimit;
    }

}
