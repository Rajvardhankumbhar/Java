import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the day : ");
        String day = sc.nextLine().toUpperCase();

        switch(day){
            case "MONDAY" -> System.out.println("It is a weekday.");
            case "TUESDAY" -> System.out.println("It is a weekday.");
            case "THURSDAY" -> System.out.println("It is a weekday.");
            case "WEDNESDAY" -> System.out.println("It is a weekday.");
            case "FRIDAY" -> System.out.println("It is a weekday.");
            case "SATURDAY" -> System.out.println("It is a weekend.");  
            case "SUNDAY" -> System.out.println("It is a weekend.");
            default -> System.out.println(day +" is not a valid day.");
        }
    }
}
