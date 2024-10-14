import java.io.FileWriter;
import java.io.IOException;

public class Program5 {
    public static void main(String[] args) {
        AccountStack<Checking> checkingStack = new AccountStack<>();
        AccountStack<Savings> savingsStack = new AccountStack<>();

        // Generate and push 25 Checking accounts
        for (int i = 0; i < 25; i++) {
            Checking checkingAccount = new Checking();  // Default constructor, assumes default values
            checkingStack.push(checkingAccount);
        }

        // Generate and push 25 Savings accounts with example values
        for (int i = 0; i < 25; i++) {
            String accountName = "Savings Account " + (i + 1);
            double balance = 1000.0;  // Example balance
            double interestRate = 0.05;  // Example interest rate
            Savings savingsAccount = new Savings(accountName, balance, interestRate);
            savingsStack.push(savingsAccount);
        }

        // Write the Checking stack to file
        try (FileWriter checkWriter = new FileWriter("CheckStack.txt")) {
            for (Checking account : checkingStack.getStack()) {
                checkWriter.write(account.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to CheckStack.txt: " + e.getMessage());
        }

        // Write the Savings stack to file
        try (FileWriter saveWriter = new FileWriter("SaveStack.txt")) {
            for (Savings account : savingsStack.getStack()) {
                saveWriter.write(account.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to SaveStack.txt: " + e.getMessage());
        }
    }
}