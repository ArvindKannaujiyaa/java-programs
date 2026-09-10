class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Bonus: Rs. " + bonus);
        System.out.println("Total Salary: Rs. " + (salary + bonus));
    }
}

public class CaseStudy8 {
    public static void main(String[] args) {

        Employee e = new Employee("Arvind", 30000);

        System.out.println("--- Employee Details ---");
        e.displayEmployee();

        Manager m = new Manager("Rahul", 50000, 10000);

        System.out.println("\n--- Manager Details ---");
        m.displayManager();
    }
}