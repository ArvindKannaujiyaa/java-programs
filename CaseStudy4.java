import java.util.Scanner;

class Product {
    int productID;
    String productName;
    double price;
    int quantity;

    void input(Scanner sc) {
        System.out.print("Enter Product ID: ");
        productID = sc.nextInt();

        System.out.print("Enter Product Name: ");
        productName = sc.next();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(productID + "\t" + productName + "\t" +
                           price + "\t" + quantity + "\t" + totalCost());
    }
}

public class CaseStudy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];
        double totalBill = 0;

        for (int i = 0; i < n; i++) {
            products[i] = new Product();

            System.out.println("\nEnter details of Product " + (i + 1));
            products[i].input(sc);

            totalBill += products[i].totalCost();
        }

        System.out.println("\nProduct Details");
        System.out.println("ID\tName\tPrice\tQty\tTotal");

        for (int i = 0; i < n; i++) {
            products[i].display();
        }

        System.out.println("\nTotal Bill: ₹" + totalBill);

        double discount = 0;

        if (totalBill > 5000) {
            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);
    }
}