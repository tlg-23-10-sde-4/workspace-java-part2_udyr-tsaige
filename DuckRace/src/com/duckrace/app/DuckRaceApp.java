package com.duckrace.app;

import com.duckrace.Board;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;
import com.duckrace.Reward;

/*
 * Application "controller"
 * It directed the overall flow/sequence of the application.
 * and dies all user prompting.
 */


public class DuckRaceApp {
    private final Board bord = new Board();
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        showBoard();
       int id = promptForId();
       Reward reward = promptForReward();
        updateBoard(id, reward);
        showBoard();

    }

    private void updateBoard(int id, Reward reward) {
        bord.update(id, reward);

    }

    private Reward promptForReward() {
        Reward reward = null;

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please [D]ebit card or [p]rizes");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("D|P")) {
                validInput = true;
                reward = ("D".equals(input)) ? Reward.DEBIT_CARD : Reward.PRIZES ;

            }
        }

        return  reward;

    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter id of the winner[1-19]: ");  // TODO: do not hardcode the 19
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1,2}")) {
                id = Integer.parseInt(input); // it's safe to do this now
                if (1 <= id && id <=19) {   // TODO: don't hardcode the 19
                    validInput = true;

                }

            }

        }

        return id;
    }

    private void showBoard() {
        board.show();

    }
    private void welcome() {
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("W E L C O M E T O T H E D U C K R A C E A P P");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();


    }

}
