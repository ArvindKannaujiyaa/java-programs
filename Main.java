import java.util.Scanner;

class Employee {
    int employeeID;
    String name;
    double basicSalary;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        employeeID = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        sc.close();
    }

    void display() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\nEmployee Salary Details");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.input();
        emp.display();
    }
}