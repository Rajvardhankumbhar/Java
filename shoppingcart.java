import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy? (PIZZA / COKE / BURGER): ");
        String item = scanner.nextLine().trim().toUpperCase();

        double pricePerItem = 0.0;

        
        switch (item) {
            case "PIZZA":
                pricePerItem = 12.99;
                break;
            case "COKE":
                pricePerItem = 1.99;
                break;
            case "BURGER":
                pricePerItem = 7.49;
                break;
            default:
                System.out.println("Sorry, we don't have that item.");
                scanner.close();
                return;
        }

        System.out.println("Price of 1 " + item + " is $" + pricePerItem);

        System.out.print("How many " + item + "(s) would you like to buy?: ");
        int quantity = scanner.nextInt();
        scanner.close();

        double totalCost = pricePerItem * quantity;

        System.out.printf("The total cost for %d %s(s) is: $%.2f%n", quantity, item, totalCost);
        System.out.println("Thank you for shopping with us!");
    }
}
