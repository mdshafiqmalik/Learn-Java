package com.shafiqhub;
import java.util.Scanner;
public class LS_16_RSP_game {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissor Game");
        System.out.println("Please choose any Number");
        System.out.println("\tRock(R/r)\tScissor(S/s)\tPaper(P/p)");
        int myScore = 0;
        int compScore = 0;
        int i = 1;

        while(i <= 6) {
            int randomNum = (int)Math.floor(Math.random() * 3.0D + 1.0D);
            System.out.println("\n");
            char compOption = 32;
            if (randomNum == 1) {
                compOption = 82;
            } else if (randomNum == 2) {
                compOption = 80;
            } else if (randomNum == 3) {
                compOption = 83;
            }

            System.out.print("Enter RSP: ");
            Scanner mySelection = new Scanner(System.in);
            char userOption = mySelection.next().charAt(0);
            boolean dr1 = (userOption == 'R' || userOption == 'r') && compOption == 82;
            boolean dr2 = (userOption == 'P' || userOption == 'p') && compOption == 80;
            boolean dr3 = (userOption == 'S' || userOption == 's') && compOption == 83;
            boolean draw = dr1 || dr2 || dr3;
            boolean won1 = (userOption == 'R' || userOption == 'r') && compOption == 83;
            boolean won2 = (userOption == 'P' || userOption == 'p') && compOption == 82;
            boolean won3 = (userOption == 'S' || userOption == 's') && compOption == 80;
            boolean won = won1 || won2 || won3;
            boolean loss1 = (userOption == 'R' || userOption == 'r') && compOption == 80;
            boolean loss2 = (userOption == 'P' || userOption == 'p') && compOption == 83;
            boolean loss3 = (userOption == 'S' || userOption == 's') && compOption == 82;
            boolean loss = loss1 || loss2 || loss3;
            if (draw) {
                System.out.println("Status: Draw");
                --i;
            } else if (won) {
                ++myScore;
                System.out.printf("Your Score: %d\n", myScore);
            } else if (loss) {
                ++compScore;
                System.out.printf("Your Score: %d\n", myScore);
            } else {
                System.out.println("Please Enter R, S, or P in capital or small only");
                --i;
            }

            ++i;
            System.out.println("Computer Score: " + compScore);
            System.out.println("Remaining Attempts: " + (7 - i) + "\n");
        }

        System.out.print("Computer Score: " + compScore + "\n");
        System.out.print("Your Score: " + myScore + "\n");
        if (compScore > myScore) {
            System.out.print("Overall Result: You Loss");
        } else if (compScore == myScore) {
            System.out.print("Overall Result: Draw");
        } else {
            System.out.println("Overall Result: You Won");
        }

    }
}
