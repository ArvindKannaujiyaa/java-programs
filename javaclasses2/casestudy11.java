package javaclasses2;

 import java.util.Scanner;

public class casestudy11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");

            // Check invalid input
            if (!sc.hasNextInt()) {
                throw new Exception("Invalid input! Number of subjects must be a number.");
            }

            int subjects = sc.nextInt();

            // Check zero subjects
            if (subjects == 0) {
                throw new ArithmeticException(
                    "Cannot calculate average! No subjects are entered."
                );
            }

            if (subjects < 0) {
                throw new Exception(
                    "Invalid input! Number of subjects cannot be negative."
                );
            }

            int total = 0;

            for (int i = 1; i <= subjects; i++) {

                System.out.print("Enter marks for subject " + i + ": ");

                // Check invalid input
                if (!sc.hasNextInt()) {
                    throw new Exception(
                        "Invalid input! Marks must be a number."
                    );
                }

                int marks = sc.nextInt();

                // Check marks range
                if (marks < 0 || marks > 100) {
                    throw new Exception(
                        "Invalid marks! Marks must be between 0 and 100."
                    );
                }

                total = total + marks;
            }

            // Calculate average
            double average = (double) total / subjects;

            System.out.println("\nTotal Marks: " + total);
            System.out.println("Average Marks: " + average);

        } catch (ArithmeticException e) {
            System.out.println("\nException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }

        sc.close();
    }
}