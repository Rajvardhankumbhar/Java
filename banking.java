
import java.util.Scanner;

public class banking {

    public static void main(String[] args) {
        double balance = 0.0;
        int choice;
        do {
            System.out.println("\nWelcome to the Banking System");
            System.out.println("\n1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nYour balance is " + balance);
                    break;
                case 2:
                    System.out.println("\nEnter the amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    break;

                case 3:
                    System.out.println("\nEnter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("\nInsufficient balance.");
                    } else {
                        balance -= withdraw;
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for using the Banking System. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");

            }

        } while (choice != 4);
    }
}
