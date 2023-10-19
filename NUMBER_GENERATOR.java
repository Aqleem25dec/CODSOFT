import java.util.Random;
import java.util.Scanner;
public class NUMBER_GENERATOR {
   public static void main(String[] args) {
       // Generate a random number between 0 and 99
       Random random = new Random();
       int Number = random.nextInt(100); // Get user input
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number between 0 and 99:");
       int guess = scanner.nextInt(); // Check if the guess is correct
       while (guess != Number) {
           if (guess < Number) {
               System.out.println("Your guess is too low. Try again:");
               guess = scanner.nextInt();
           } else {
               System.out.println("Your guess is too high. Try again:");
               guess = scanner.nextInt();
           }
       }

       // Print the winning message
       System.out.println("Congratulations! You guessed the correct number.");
   }
}