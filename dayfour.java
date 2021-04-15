import java.util.Arrays;

/**
 * Date: 15/04/2021
 * Day: 4 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * this is probably going to be chess
 */


//Comment for me probably 
//fix the fucking ui
//You're the best

public class dayfour {
    
    //global primitives
    private char[][] board = new char[10][10];
    private char[] letters = {'A','B','C','D','E','F','G','H'};
    private char[] players = {'p',//pawn
                              'C',//Castle
                              'k',//Knight
                              'B',//Bishop
                              'Q',//Queen
                             'K'};//King
    private int arrayLikeBoard = 9;

    public static void main(String[] args) {
        dayfour day = new dayfour();
        day.setBoard();
        day.printBoard();
    }

    //This method creates the starting board
    public void setBoard(){
        board[0][0] = board[9][9] = board[0][9] = board[9][0] = ' ';

        //this creates empty spaces
        for (int i = 1; i < arrayLikeBoard ; i++) {
            for (int j = 1; j < arrayLikeBoard; j++) {
                board[i][j]='-';
            }
        }
        //this sets letters
        for (int i = 1; i < arrayLikeBoard; i++) {
            board[0][i] = letters[i-1];
            board[9][i] = letters[i-1];
        }
        //this sets numbers
        for (int i = 1; i < arrayLikeBoard; i++) {
            board[i][0] = Character.forDigit(i, 10);
            board[i][9] = Character.forDigit(i, 10);
        }
        //this sets pawns
        for (int i = 1; i < arrayLikeBoard; i++) {
            board[2][i] = players[0];
            board[7][i] = players[0];
        }
        //this sets Castles
            board[1][1] = players[1];
            board[1][8] = players[1];
            board[8][1] = players[1];
            board[8][8] = players[1];
        //this sets knights
            board[1][2] = players[2];
            board[1][7] = players[2];
            board[8][2] = players[2];
            board[8][7] = players[2];
        //this sets Bishops
            board[1][3] = players[3];
            board[1][6] = players[3];
            board[8][3] = players[3];
            board[8][6] = players[3];
        //this sets Queens
            board[1][4] = players[4];
            board[8][4] = players[4];
        //this sets Kings
            board[1][5] = players[5];
            board[8][5] = players[5];
        
        
    }

    //This method prints the board
    public void printBoard(){
        System.out.println("-----------------------------------------");
        for (int i = 0; i <= arrayLikeBoard; i++) {
            System.out.print("| ");
            for (int j = 0; j <= arrayLikeBoard; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------------------------------------");
            
        }
    }


}
