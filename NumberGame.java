import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int maxGuesses = 10;
        int score = 0;
        do{
            int randomNumber = random.nextInt(100) + 1; 
            int guessCount = 0;
            int guess;
            do{
                System.out.print("Guess a number between 1 and 100: ");
                guess = scanner.nextInt();
                guessCount++;
                
                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
            }else
            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
                score += (maxGuesses - guessCount); // Update score based on remaining attempts
            }
        }
        while (guess != randomNumber && guessCount < maxGuesses);

            if (guessCount == maxGuesses) {
                System.out.println("Sorry, you ran out of guesses. The number was " + randomNumber + ".");
            }
            System.out.print("Do you want to play again? (y/n): ");
        }
        while (scanner.next().equalsIgnoreCase("y"));
        System.out.println("Your final score is: " + score);
    }
}
