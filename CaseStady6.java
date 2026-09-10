
import java.util.Scanner;

public class CaseStady6 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.getData();
        p.displayData();
    }
}

class Patient {
    int patientID;
    String name;
    int age;
    double temperature;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        patientID = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Temperature (F): ");
        temperature = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\n--- Patient Details ---");
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");

        if (temperature > 100.4) {
            System.out.println("Status: Fever");
        } else {
            System.out.println("Status: Normal");
        }
    }
}
