package javaclasses2;
import java.util.Scanner;
public class casestudy10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        try {
            System.out.print("Enter withdrawal amount: ");
            if (!sc.hasNextDouble()) {
                throw new Exception("Invalid input! Amount must be a number.");
            }

            double amount = sc.nextDouble();
            if (amount <= 0) {
                throw new Exception(
                    "Invalid withdrawal amount! Amount must be greater than 0."
                );
            }
            if (amount > balance) {
                throw new Exception(
                    "Insufficient balance! Available balance is ₹" + balance
                );
            }
            balance = balance - amount;
            System.out.println("\nWithdrawal successful!");
            System.out.println("Withdrawn Amount: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }

        sc.close();
    }
}