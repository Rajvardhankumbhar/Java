import java.util.Scanner;
public class add {
    public static void main(String[] args){
        try(Scanner s = new Scanner(System.in)){

        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        s.close();
    }
}
}