import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean doneMoveA = false;
        boolean doneMoveB = false;
        boolean donePlaying = false;
        boolean keepPlaying = false;

        String playerA = "";
        String playerB = "";
        String done = "";

             do {

                do {
                    System.out.print("Player A, please enter your move: [R,P,S] ");
                    playerA = in.nextLine();

                    if (playerA.equalsIgnoreCase("R") ||
                            playerA.equalsIgnoreCase("P") ||
                            playerA.equalsIgnoreCase("S"))
                    {
                        doneMoveA = true;
                    }
                    else System.out.println("Invalid move! Your move must be R,P,or S!");

                }while (!doneMoveA);

                do {
                    System.out.print("Player B, please enter your move: [R,P,S] ");
                    playerB = in.nextLine();

                    if (playerB.equalsIgnoreCase("R") ||
                            playerB.equalsIgnoreCase("P") ||
                            playerB.equalsIgnoreCase("S"))
                    {
                        doneMoveB = true;
                    }
                    else System.out.println("Invalid move! Your move must be R,P,or S!");


                }while(!doneMoveB);

                if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
                    System.out.println("Paper covers rock! Player B wins! ");
                }
                else if (playerA.equalsIgnoreCase("r")&& playerB.equalsIgnoreCase("s")) {
                    System.out.println("Rock breaks scissors! Player A wins!");
                }
                else if (playerA.equalsIgnoreCase("p")&& playerB.equalsIgnoreCase("r")) {
                    System.out.println("Paper covers rock! Player A wins!");
                }
                else if (playerA.equalsIgnoreCase("p")&& playerB.equalsIgnoreCase("s")) {
                    System.out.println("Scissors cuts paper! Player B wins!");
                }
                else if (playerA.equalsIgnoreCase("s")&& playerB.equalsIgnoreCase("r")) {
                    System.out.println("Rock breaks scissors! Player B wins!");
                }
                else if (playerA.equalsIgnoreCase("s")&& playerB.equalsIgnoreCase("p")) {
                    System.out.println("Scissors cuts paper! Player A wins!");
                }
                else if (playerA.equalsIgnoreCase("r")&& playerB.equalsIgnoreCase("r")) {
                    System.out.println("Rock vs rock! its a tie!");
                }
                else if (playerA.equalsIgnoreCase("s")&& playerB.equalsIgnoreCase("s")) {
                    System.out.println("Scissors vs scissors! its a tie!");
                }
                else if (playerA.equalsIgnoreCase("p")&& playerB.equalsIgnoreCase("p")) {
                    System.out.println("Paper vs paper! its a tie!");
                }

                do {
                    System.out.print("Would you like to keep playing? [Y/N]: ");
                    done = in.nextLine();

                    if (done.equalsIgnoreCase("n")) {
                        keepPlaying = true;
                        donePlaying = true;
                    } else if (done.equalsIgnoreCase("y")) {
                        keepPlaying = true;
                    }
                }while (!keepPlaying);

            }while (!donePlaying);
        }
    }
