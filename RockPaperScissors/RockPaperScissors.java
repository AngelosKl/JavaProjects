import java.util.Scanner;
import java.util.*;

class rps {
    public static void main (String [] args){
        boolean quit = false;
        String inputString;
        int userScore=0;
        int aiScore=0;
        Scanner scanner = new Scanner(System.in);

        while(!quit) {
            System.out.println("Let's go!");
            System.out.println("The computer has decided!");

            String [] availableMoves = {"Rock", "Paper", "Scissors"};
            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

            System.out.println("Choose!");
            System.out.println("Type: 'Rock' or 'Paper' or 'Scissors'!");
            inputString = scanner.nextLine();

            if(inputString.equals("Rock") || inputString.equals("Paper") || inputString.equals("Scissors")) {
                System.out.println();

                System.out.println("The computer has chosen: " + computerMove);
                System.out.println("You have chosen: " + inputString);
                System.out.println("");

                if(computerMove.equals(inputString)) {
                    System.out.println("It's a tie");
                }
                else if(computerMove.equals("Rock")) {
                    if (inputString.equals("Paper")) {
                        System.out.println("You Won!");
                        userScore++;
                       
                    }
                    else if (inputString.equals("Scissors")) {
                        System.out.println("You lost!");
                        aiScore++;
                    }
                }
                else if(computerMove.equals("Scissors")) {
                    if (inputString.equals("Paper")) {
                        System.out.println("You lost!");
                        aiScore++;
                    }
                    else if (inputString.equals("Rock")) {
                        System.out.println("You won!");
                        userScore++;
                    }
                }
                else if(computerMove.equals("Paper")) {
                    if (inputString.equals("Rock")) {
                        System.out.println("You lost!");
                        aiScore++;
                    }
                    else if (inputString.equals("Scissors")) {
                        System.out.println("You won!");
                        userScore++;
                    }
                }

                System.out.println("The score is: AI: " + aiScore + " Player: " + userScore);
                System.out.println("");

                if (userScore == 3) {
                    System.out.println("YOU WON! Run again if you want another go..");
                    quit = true;
                }
                else if (aiScore == 3) {
                    System.out.println("YOU LOST! Run again if you want another go..");
                    quit = true;
                }
            }
            else {
                System.out.println("Invalid move!");
            }
        }

        // Κλείσιμο του Scanner
        scanner.close();
    }
}
