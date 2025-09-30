import java.util.Scanner;
public class weightconversion {
    public static void main(String[] args) {
        System.out.println("\nWeight Conversion Program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("\nPounds to Kilograms Conversion");
            System.out.print("Enter weight in pounds: ");
            double pounds = scanner.nextDouble();
            double kilograms = pounds * 0.453592;
            System.out.println(pounds + " pounds is equal to " + String.format("%.2f", kilograms) + " kilograms.");
        }
        else if(choice == 2){
            System.out.println("\nKilograms to Pounds Conversion");
            System.out.println("Enter weight in kilograms: ");
            double kilograms = scanner.nextDouble();
            double pounds = kilograms / 0.453592;
            System.out.println(kilograms + " kilograms is equal to "+ String.format("%.2f",pounds)+"pounds.");
        }
        else{
            System.out.println("Invalid choice. Select either 1 or 2.");
        }
    }
}

