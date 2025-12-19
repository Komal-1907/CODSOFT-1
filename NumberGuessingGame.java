import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                int totalRounds = 0;
                int roundsWon = 0;
                char playAgain;

                System.out.println("Welcome to the Number Guessing Game!");

                do {
                        totalRounds++;
                        int numberToGuess = random.nextInt(100) + 1;
                        int maxAttempts = 5;
                        boolean guessedCorrectly = false;

                        System.out.println("\nRound " + totalRounds);
                        System.out.println("Guess a number between 1 and 100");
                        System.out.println("You have " + maxAttempts + " attempts.");

                        for (int i = 1; i <= maxAttempts; i++) {
                                System.out.print("Attempt " + i + ": ");
                                int guess = sc.nextInt();

                                if (guess == numberToGuess) {
                                        System.out.println("Correct! You guessed the number.");
                                        guessedCorrectly = true;
                                        roundsWon++;
                                        break;
                                } else if (guess > numberToGuess) {
                                        System.out.println("Too High!");
                                } else {
                                        System.out.println("Too Low!");
                                }
                        }

                        if (!guessedCorrectly) {
                                System.out.println("Attempts finished.");
                                System.out.println("Correct number was: " + numberToGuess);
                        }

                        System.out.print("Play again? (y/n): ");
                        playAgain = sc.next().charAt(0);

                } while (playAgain == 'y' || playAgain == 'Y');

                System.out.println("\n Game Summary");
                System.out.println("Total Rounds Played: " + totalRounds);
                System.out.println("Rounds Won: " + roundsWon);
                System.out.println("Thank you for playing!");

                sc.close();
        }
}
