package com.company;
/**
 * NAMES: UTKARSH KARKI, MARCOS LOPEZ, DAVID FLORES
 * ACCOUNTS: KARKI002, LOPEZ816, FLORES510
 */

import java.util.Scanner;

public class TicTacToe {

    //declare and initialize a constant
    private final static int BOARD_SIZE = 3;

    //declare and initialize an enum
    enum Status {
        WIN,
        DRAW,
        CONTINUE;
    }

    //declare and initialize a 2D char array of size 3x3
    static char [][] board = new char[BOARD_SIZE][BOARD_SIZE];

    //int variable to store the user's input for row
    static int row;

    //int variable to store the user's input for column
    static int col;

    //Scanner class to read the user's input
    static Scanner in;

    //char variable to hold the X's or O's turn
    static char turn;

    public static void main(String[] args) {

        in = new Scanner(System.in);
        turn = 'X';
        populateEmptyBoard();
        Status gameStatus = Status.CONTINUE;

        getUserInput();

        while (gameStatus == Status.CONTINUE) {

            if(validMove(row, col)){
                printSymbol(row, col);

                printBoard();
                gameStatus = gameStatus();
                switch (gameStatus){
                    case WIN:
                        System.out.println("Player " + turn + " wins.");
                        break;

                    case DRAW:
                        System.out.println("The game is a draw.");
                        break;

                    case CONTINUE:
                        changeSymbol();
                        getUserInput();
                }
            }else{
                System.out.println("\nThe spot is already marked, please enter again.");
                getUserInput();
            }

        }
    }

    /**
     * This methods asks the user for input; 1 or 2 or 3 for row and column, and checks if the input
     * is valid or not.
     */
    static void getUserInput(){
        System.out.println("If inputted number except 1, 2 or 3. The player will be prompted to enter again.");
        do{
            System.out.print("Player " + turn + "'s turn.\n" +  "Player " + turn + ": Enter row ( 1, 2 or 3 ): ");
            row= in.nextInt();
            in.nextLine();

            System.out.print("Player " + turn + ": Enter column ( 1, 2 or 3 ): ");
            col = in.nextInt();
            in.nextLine();

        }while( !(((row < 4) && (row > 0)) && ((col < 4) && (col > 0))) );
    }

    /**
     * This method changes the symbol; it changes player's turn from X to O and vice versa
     */
    static void changeSymbol(){
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';
        }
    }

    /**
     * This method checks the game's status after every move a player makes; if the game is won at any
     * point during the match, it returns enum{WON}. if the game is drawn it returns enum{DRAW}, and
     * return enum{CONTINUE} if the game is not drawn or won.
     * @return
     */
    static Status gameStatus() {
        StringBuilder line;
        line = new StringBuilder();
        for (int a = 0; a < 8; a++) {
            line.setLength(0);
            switch (a) {
                case 0:
                    line.append(board[0][0]).append(board[0][1]).append(board[0][2]);
                    break;
                case 1:
                    line.append(board[1][0]).append(board[1][1]).append(board[1][2]);
                    break;
                case 2:
                    line.append(board[2][0]).append(board[2][1]).append(board[2][2]);
                    break;
                case 3:
                    line.append(board[0][0]).append(board[1][0]).append(board[2][0]);
                    break;
                case 4:
                    line.append(board[0][1]).append(board[1][1]).append(board[2][1]);
                    break;
                case 5:
                    line.append(board[0][2]).append(board[1][2]).append(board[2][2]);
                    break;
                case 6:
                    line.append(board[0][0]).append(board[1][1]).append(board[2][2]);
                    break;
                case 7:
                    line.append(board[2][0]).append(board[1][1]).append(board[0][2]);
                    break;
            }
            //If at any point the board contains "XXX" or "OOO" horizontally, vertically or
            //diagonally, the game is won.
            if ( (line.toString().contains("XXX")) || line.toString().contains("OOO")) {
                return Status.WIN;
            }
        }
        //If at any point the board has a ' ' char, the game has to continue
        for (int a = 0; a < BOARD_SIZE; a++) {
            for(int b = 0; b < BOARD_SIZE ; b++){
                if(board[a][b] == ' '){
                    return Status.CONTINUE;
                }
            }
        }
        return Status.DRAW;
    }

    /**
     * This method prints the board after every move.
     */
    static void printBoard() {
        System.out.println(" ________________________ ");
        System.out.println("|       |       |       |");
        System.out.println("|   " + board[0][0] + "   |   " + board[0][1] + "   |   " + board[0][2] + "   |");
        System.out.println("|_______|_______|_______|");
        System.out.println("|       |       |       |");
        System.out.println("|   " + board[1][0] + "   |   " + board[1][1] + "   |   " + board[1][2] + "   |");
        System.out.println("|_______|_______|_______|");
        System.out.println("|       |       |       |");
        System.out.println("|   " + board[2][0] + "   |   " + board[2][1] + "   |   " + board[2][2] + "   |");
        System.out.println("|_______|_______|_______|");
    }

    /**
     * This method populates the board with ' ' char before the game begins.
     */
    static void populateEmptyBoard() {
        for (int a = 0; a < BOARD_SIZE; a++) {
            for(int b = 0; b < BOARD_SIZE; b++){
                board[a][b] = ' ';
            }
        }
    }

    /**
     * This method checks if the user's input has a spot in the board or not.
     */
    static boolean validMove(int row, int col){
        return(board[row-1][col-1] == ' ');
    }

    /**
     * This method prints the symbol, X or O, in the board.
     */
    static void printSymbol(int row, int col){
        board[row-1][col-1] = turn;
    }
}
