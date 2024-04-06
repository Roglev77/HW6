import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int targetNumber = random.nextInt(101);

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > targetNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        scanner.close();
    }
}