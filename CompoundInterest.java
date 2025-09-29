import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        double principal ;
        double rate ;
        int timesCompounded ;
        int years ;

        System.out.println("Compound Interest Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.print( "\nEnter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print( "\nEnter the annual interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("\nEnter the number of times intrest compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("\nNumber of years the money in invested for: ");
        years = scanner.nextInt();
        scanner.close();

        double amount = principal * Math.pow((1 + (rate / (timesCompounded * 100))), timesCompounded * years);
        System.out.println("After " + years + " years, the investment will be worth: $" + String.format("%.2f", amount));
    }
    
}
