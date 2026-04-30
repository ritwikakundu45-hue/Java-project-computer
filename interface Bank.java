interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Customer Class
class Customer {
    String name;
    int customerId;

    void getCustomerDetails(String name, int id) {
        this.name = name;
        this.customerId = id;
    }

    void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Account Class implementing Bank interface
class Account extends Customer implements Bank {
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayAccountDetails() {
        displayCustomerDetails();
        System.out.println("Current Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.getCustomerDetails("Riya", 101);
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.displayAccountDetails();
    }
}