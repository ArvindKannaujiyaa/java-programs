import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Create account
    void createAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.next();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    // Deposit
    void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw
    void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
}

public class CaseStudy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        account.createAccount(sc);
        account.deposit(sc);
        account.withdraw(sc);
        account.displayBalance();

        sc.close();
    }
}