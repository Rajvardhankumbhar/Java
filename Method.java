
public class Method {

    public static void HappyBirthday(int i) {
        System.out.println("\nHappy Birthday to you!");
        System.out.println("Happy Birthday dear you!");

        System.out.printf("You are %d years old.\n", i);
        System.out.println("Happy Birthday dear User.\n");

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            HappyBirthday(i);
        }
    }
}
