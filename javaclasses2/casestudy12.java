package javaclasses2;
import java.util.Scanner;
public class casestudy12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter product price: ");
            if (!sc.hasNextDouble()) {
                throw new Exception("Invalid input! Price must be a number.");
            }
            double price = sc.nextDouble();
            if (price <= 0) {
                throw new Exception(
                    "Invalid product price! Price must be greater than 0."
                );
            }
            System.out.print("Enter quantity: ");
            if (!sc.hasNextInt()) {
                throw new Exception("Invalid input! Quantity must be a number.");
            }
            int quantity = sc.nextInt();
            if (quantity <= 0) {
                throw new Exception(
                    "Invalid quantity! Quantity must be greater than 0."
                );
            }
            System.out.print("Enter discount percentage: ");
            if (!sc.hasNextDouble()) {
                throw new Exception(
                    "Invalid input! Discount must be a number."
                );
            }
            double discount = sc.nextDouble();
            if (discount < 0 || discount > 100) {
                throw new Exception(
                    "Invalid discount! Discount must be between 0 and 100."
                );
            }
            double total = price * quantity;
            double discountAmount = total * discount / 100;
            double finalAmount = total - discountAmount;
            System.out.println("\n========== BILL ==========");
            System.out.println("Product Price    : ₹" + price);
            System.out.println("Quantity         : " + quantity);
            System.out.println("Total Amount     : ₹" + total);
            System.out.println("Discount         : " + discount + "%");
            System.out.println("Discount Amount  : ₹" + discountAmount);
            System.out.println("Final Bill       : ₹" + finalAmount);
            System.out.print("\nEnter payment amount: ");
            if (!sc.hasNextDouble()) {
                throw new Exception(
                    "Invalid input! Payment must be a number."
                );
            }
            double payment = sc.nextDouble();
            if (payment < finalAmount) {
                throw new Exception(
                    "Payment amount is less than the bill!"
                );
            }
            double remaining = payment - finalAmount;
            System.out.println("\nPayment successful!");
            System.out.println("Payment Amount    : ₹" + payment);
            System.out.println("Change             : ₹" + remaining);
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        sc.close();
    }
}