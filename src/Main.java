import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String PlayerA;
         String PlayerB;
         Boolean done;

        String playerA, playerB, doneYN;

        do {
            // Prompt Player A's move
            do
            {
                System.out.print("Player A choose your move: Rock, Paper, or Scissors [R,P,S]: ");
                playerA = input.nextLine().trim();

                if (playerA.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock!");
                } else if (playerA.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper!");
                } else if (playerA.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors!");
                } else {
                    System.out.println("Invalid, you must choose R, P, or S not " + playerA);
                }
            } while (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")));

            // Prompt Player B's move
            do
            {
                System.out.print("Player B choose your move: Rock, Paper, or Scissors [R,P,S]: ");
                playerB = input.nextLine().trim();

                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock!");
                } else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper!");
                } else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors!");
                } else {
                    System.out.println("Invalid, you must choose R, P, or S not " + playerB);
                }
            } while (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")));

            // Determine winner
            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock it's a Tie!");
                } else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock! Player B Wins!");
                } else {
                    System.out.println("Rock breaks Scissors! Player A Wins!");
                }
            } else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock! Player A Wins!");
                } else
                {
                    System.out.println("Scissors cuts Paper! Player B Wins!");
                }
            } else if (playerA.equalsIgnoreCase("S"))
            {
                if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                } else if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors! Player B Wins!");
                } else {
                    System.out.println("Scissors cuts Paper! Player A Wins!");
                }
            }

            // Prompt to continue
            System.out.print("Do you wish to continue? [Y or N]: ");
            doneYN = input.nextLine().trim();

        } while (doneYN.equalsIgnoreCase("Y"));

        input.close();
    }
}