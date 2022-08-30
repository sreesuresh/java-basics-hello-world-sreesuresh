import java.util.*;

public class RockPaperScissors {
    public static void printChoice() {
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int numberOfRounds;
            System.out.print("Enter the number of rounds: ");
            numberOfRounds = input.nextInt();
            if (numberOfRounds < 1 || numberOfRounds > 10) {
                System.out.println("Invalid input...");
                System.exit(-1);
            }
            int userChoice = 0, computerChoice = 0;
            int tie = 0, userWins = 0, computerWins = 0;
            for (int i = 0; i < numberOfRounds; i++) {
                printChoice();
                userChoice = input.nextInt();
                //Taking random input for computer's choice(int computerChoice = (int) (Math.random() * (max - min + 1) + min);)
                computerChoice = (int) (Math.random() * (3) + 1);
                if (userChoice == computerChoice) {
                    tie++;
                    System.out.println("Tie");
                } else if (userChoice == 1) {
                    if (computerChoice == 2) {
                        computerWins++;
                        System.out.println("Computer Wins");
                    } else if (computerChoice == 3) {
                        userWins++;
                        System.out.println("User Wins");
                    }
                } else if (userChoice == 2) {
                    if (computerChoice == 1) {
                        userWins++;
                        System.out.println("User Wins");
                    } else if (computerChoice == 3) {
                        computerWins++;
                        System.out.println("Computer Wins");
                    }
                } else if (userChoice == 3) {
                    if (computerChoice == 1) {
                        computerWins++;
                        System.out.println("Computer Wins");
                    } else if (computerChoice == 2) {
                        userWins++;
                        System.out.println("User Wins");
                    }
                }
            } //End of for loop
            System.out.println("Ties: " + tie);
            System.out.println("User wins: " + userWins);
            System.out.println("Computer wins: " + computerWins);
            if (userWins > computerWins)
                System.out.println("Winner of the Game: USER...");
            else if (computerWins > userWins)
                System.out.println("Winner of the Game: COMPUTER...");
            else
                System.out.println("No one Wins: TIE!!!");

            System.out.println("Would you like to play again? y/n ");
            String answer = "";
            answer = input.next().toLowerCase();
            if (answer.equals("y"))
                continue;
            else
                System.out.println("Thanks for playing!");
            break;
        }//End of While Loop.
        input.close();
    }

}

