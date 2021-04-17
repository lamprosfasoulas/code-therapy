/**
 * Date: 16/04/2021
 * Day: 5 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * simple tic tac toe in c 
 */

#include <stdio.h>

int cols = 3, rows = 3;
char board [9];
char turn;


void setBoard(){
    for (size_t i = 0; i < 9; i++)
    {
        board[i] = '-'; 
    }
}
void printBoard(){
    int a = 0;
    printf("-------------\n");
    
        for (size_t i = 0; i < rows; i++)
        {
            printf("| ");
            for (size_t j = 0; j< cols; j++)
            {
                printf("%c | ",board[a]);
                a +=1;
            }
            printf("\n");
            printf("-------------\n");
        }
    
}

void changeTurn(){
    if (turn == 'x')
    {
        turn = 'o';
    }
    else if (turn == 'o'){
        turn = 'x';
    }
    
}
int checkForWins(){//this is a mess because i forgot that arrays start at 0
    if ( 
       (board[1-1] == board[2-1] && board[2-1] == board[3-1] && board[0] != '-') 
    || (board[4-1] == board[5-1] && board[5-1] == board[6-1] && board[3] != '-') 
    || (board[7-1] == board[8-1] && board[8-1] == board[9-1] && board[6] != '-') 
    || (board[1-1] == board[4-1] && board[4-1] == board[7-1] && board[0] != '-') 
    || (board[2-1] == board[5-1] && board[5-1] == board[8-1] && board[1] != '-') 
    || (board[3-1] == board[6-1] && board[6-1] == board[9-1] && board[2] != '-') 
    || (board[1-1] == board[5-1] && board[5-1] == board[9-1] && board[0] != '-') 
    || (board[3-1] == board[5-1] && board[5-1] == board[7-1] && board[2] != '-') 
     )
    {
        return 1;
    }
    else
    {
        return 0;
    }
    
    
    
}
void gameEnds(int result){
    if (result == 1)
    {
        printf("The game has ended and %c is the winner !",turn);
    }
    else if (result == 0)
    {
        printf("The game has ended in a TIE !");
    }
    
    
    

} 
int checkForTie(){
    if(
        board[0] != '-' &&
        board[1] != '-' &&
        board[2] != '-' &&
        board[3] != '-' &&
        board[4] != '-' &&
        board[5] != '-' &&
        board[6] != '-' &&
        board[7] != '-' &&
        board[8] != '-'
    )
    {
        return 1;
    }
    else
    {
        return 0;
        }
}
void gameplay(){
    int position;
    printf("Player %c select a position from 1 - 9: ",turn);
    scanf("%d",&position);
    if (position >= 1 && position <= 9 && board[position-1] == '-'){
        //this is if the position is valid
            board[position-1] = turn;
            printBoard(); 
            if(checkForWins())
            {
                gameEnds(1);
            }
            else if (checkForTie())
            {
                gameEnds(0);
            }
            
            else
            {
                changeTurn(); 
                gameplay();
            } 
        
    }
    else
    {
        printf("Position %i is not valid\n",position);
        gameplay();    
    }
    
}

void getWhoPlaysFirst(){
    char player;

    printf("Choose who plays first: \n");
    printf("Choose x or o: \n");
    scanf(" %s",&player);
        if (player == 'x' || player == 'o') {
            printf("Player %c plays first: \n",player);
            turn = player;
            gameplay();
        
        } else if (player != 'x' && player != 'o')
        {
            printf("Damn you!\n");
            getWhoPlaysFirst();
        } 
}
int main()
{
    setBoard();
    printBoard();
    getWhoPlaysFirst();
    
    return 0;
}