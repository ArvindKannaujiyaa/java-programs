package javaclasses2;
import java.util.Scanner;
public class BusTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableSeats = 40;
        try {
            System.out.print("Enter passenger age: ");
            if (!sc.hasNextInt()) {
                throw new Exception("Invalid input! Age must be a number.");
            }
            int age = sc.nextInt();
            if (age < 0) {
                throw new Exception("Invalid age! Age must be a positive number.");
            }
            System.out.print("Enter number of seats: ");
            if (!sc.hasNextInt()) {
                throw new Exception("Invalid input! Number of seats must be a number.");
            }
            int seats = sc.nextInt();
            if (seats <= 0) {
                throw new Exception(
                    "Invalid number of seats! Seats must be greater than 0."
                );
            }
            if (seats > availableSeats) {
                throw new Exception(
                    "Insufficient seats! Requested seats are not available."
                );
            }
            availableSeats -= seats;
            System.out.println("\nTicket booked successfully!");
            System.out.println("Passenger Age: " + age);
            System.out.println("Seats Booked: " + seats);
            System.out.println("Remaining Seats: " + availableSeats);
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        sc.close();
    }
}