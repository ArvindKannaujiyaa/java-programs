import java.util.Scanner;

class ATM {
    private int pin = 1234;
    private double balance = 10000;

    boolean checkPIN(int enteredPin) {
        return enteredPin == pin;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn Amount: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit successful.");
        System.out.println("Deposited Amount: Rs. " + amount);
    }

    void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class CaseStudy7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        int attempts = 0;
        boolean login = false;

        // PIN checking
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (atm.checkPIN(enteredPin)) {
                login = true;
                System.out.println("PIN correct. Login successful.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts == 3) {
                    System.out.println("Maximum attempts reached.");
                    System.out.println("Account blocked.");
                }
            }
        }

        // ATM Menu
        if (login) {
            int choice;

            do {
                System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Display Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        atm.deposit(depositAmount);
                        break;

                    case 3:
                        atm.displayBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);
        }

        sc.close();
    }
}