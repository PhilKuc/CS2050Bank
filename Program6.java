import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Queue;

public class Program6 {
    public static void main(String[] args) {
       CustomerQueue queue = new CustomerQueue();

        // Create 10 Customer objects
        for (int i = 0; i < 10; i++) {
            String accountName = "Account " + (i + 1);
            // Example balance
            double balance = 1000.0;
            // Example interest rate
            double interestRate = 0.05;

            // Randomly choose between Checking and Savings accounts
            Account account;
            if (i % 2 == 0) {
                // Assuming the Checking constructor is valid
                account = new Checking();
            } else {
                // Assuming this constructor is valid
                account = new Savings(accountName, balance, interestRate);
            }

            Customer customer = new Customer((i + 1), "CUST" + (i + 1), account);
            queue.enqueue(customer);
        }

        // Write queue to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Customers.dat"))) {
            for (int i = 0; i < 10; i++) {
                Customer customer = queue.dequeue();

            out.writeObject(customer);
        }
            System.out.println("Customer queue written to Customers.dat");
        } catch (IOException e) {
            System.out.println("Error Writing to Customers.dat: " + e.getMessage());
        }
    }
}