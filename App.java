package org.example;


import java.util.Scanner;

public class App {

    Scanner userInput = new Scanner(System.in);
    boolean exit;

    public static void main( String[] args ) {
        App appClass = new App();
        appClass.executeMenu();

    }

    public void header() {
        System.out.println();
        System.out.println();
        System.out.println(" ________________________________ ");
        System.out.println("|         WELCOME TO THE         |");
        System.out.println("|           DRAGONS CAVE         |");
        System.out.println("|______________GAME______________|");
        System.out.println();
        System.out.println(
                "You are in a land full of dragons. In front, " +
                "you see two caves.\n" + "In one cave (cave 1), " +
                "the dragon is friendly and will share his \n" +
                "treasure with you. " + "The second dragon (cave 2) " +
                "is greedy and\n" + "will eat you on sight.\n" +

                "Which cave will you go into? (1 or 2)\npress( 0 ), " +
                "if you are afraid to go in any of this caves");

        System.out.println();
    }
    public void menuSelection() {
        System.out.println(" _____ ENTER GAME SELECTION _____");
        System.out.println("| 1.    CAVE 1                   |");
        System.out.println("| 2.    CAVE 2                   |");
        System.out.println("| 3.    HISTORY OF DRAGONS       |");
        System.out.println("| 0.    Exit GAME                |");
        System.out.println("|________________________________|");
    }

    public void executeMenu() {
        header();
        menuSelection();

        while (!exit) {
            int selection = userMenuSelection();
            whatToDoWithSelectionChoice(selection);

        }

    }

    private int userMenuSelection() {
        int selection = -1;

        /**
         * A do/while condition will tell the user to Enter Menu Selection 0 to 2
         * parseInt, is going to attempt to take what you typed in the keyboard
         * and converted into an Integer and store  it in selection
         * a try/catch is needed (NumberFormatException) to invalid inputs from user if
         * a word instead of a number is input
         * An if condition is needed to check that user is not inputting numbers
         * less than 0 or grater that 2
         * @return selection
         */
        do {
            System.out.println("Enter Selection 0 to 3");
            try {
                selection = Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Selection, NUMBERS! only");
            }
            if (selection < 0 || selection > 3) {
                System.out.println("Invalid Selection, try again");
            }
        } while (selection < 0 || selection > 3);
        return selection;

    }

    public void whatToDoWithSelectionChoice(int selection) {
        /**
         * this method that will tell us what to do with selection choice
         * we need to specify the parameters or selection input from user
         * @param selection ,a switch condition is used to specify the action needed for each userinput
         */
            switch (selection) {
                case 0:
                    System.out.println("Thank you for using The Dragons Cave Application Game");
                    System.exit(0);
                    break;

                case 1:
                    intoCave1();
                    break;

                case 2:
                    intoCave2();
                    break;
                case 3:
                    historyOfDragons();
                    break;

                default:
                    System.out.println("Unknown error occurred");
            }

        }

    public void historyOfDragons() {
        HistoyOfDragons dragons = new HistoyOfDragons();
        dragons.history();
    }


    public void intoCave1() {

        System.out.println("Don't be afraid my boy I am a Friendly Dragon, come in, I will share with you " +
                "my precious treasure....but please come back again");
    }


    public void intoCave2() {
        System.out.println("You approach the cave….\n" +
                "It is dark and spooky…\n" +
                "A large dragon jumps out in front of you! He opens his jaws and…\n" +
                "Gobbles you down in one bite!\n");
    }


    }


