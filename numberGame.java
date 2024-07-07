/*
 Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.
 */
import java.util.Scanner;
import java.util.Random;

public class numberGame {
    public static void main(String[] args) {
        double score = 0.0;
        int rounds = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the range: ");
            int min = sc.nextInt();
            int max = sc.nextInt();
            Random random = new Random();
            int number = random.nextInt(max - min + 1) + min;
            int attempt = 5;
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            if (number != guess) {
                attempt--;
                while (attempt > 0 && guess != number) {
                    if (guess > number) {
                        System.out.println("Guess is too high");
                        System.out.println("Attempts Remaining: "+attempt);
                    } else if (guess < number) {
                        System.out.println("Guess is too low");
                        System.out.println("Attempts Remaining: "+attempt);
                    }
                    guess = sc.nextInt();
                    if (guess == number) {
                        break;
                    }
                    attempt--;
                }
                if (guess == number) {
                    System.out.println("You guessed it right");
                    System.out.println("Number of attempts used: " + attempt);
                }else{
                    System.out.println("You ran out of attempts");
                }
            }
            rounds++;
            score += attempt * 20;
            System.out.print("Would you like to go for more rounds: ");
            String ans = sc.next();
            if (ans.equals("no")) {
                break;
            }
        }
        sc.close();
        System.out.println("Your score is: " + score / rounds);
    }
}


