package edu.cscc;
import java.util.*;

/**
 * Lab 7
 * Rock, paper, scissors, lizard, spock game
 * @author Orsolya Papp
 */

public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * h_pick human choice
     * c_pick computer choice
     * @param args
     */

    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        /** Let's play the game!
         *  We will determine if the user input is valid using isValidPick
         *  If the choice is not valid, user needs to enter another one
         *  Then the computer will pick and we will get our game result
         *  Then the user can choose to play again or stop playing
         */

        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}