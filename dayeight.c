/**
 * Date: 19/04/2021
 * Day: 8 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * this is a c program to encrypt and decrypt text input
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MSG_SIZE 100
#define MIN 32
#define MAX 126

void errorMsg(int code);
void encrypt(int key, char msg[]);
void decrypt(int key, char msg[]);


int main(int argc, char *argv[]){
    int key;
    char msg [MSG_SIZE];
    char param [4];

    if (argc != 4)
    {
        errorMsg(1);
    }
    else
    {
        key = atoi(argv[2]);
        strcpy(param,argv[1]);
        strcpy(msg,argv[3]);
        
        if (key == 0)
        {
            errorMsg(2);
        }
        else if(strcmp(param,"-e") == 0)
        {
            encrypt(key, msg); 
        }
        else if (strcmp(param,"-d") == 0)
        {
            decrypt(key, msg);
        }
        else
        {
            errorMsg(1);
        }
        
        
    }
     
}

void errorMsg(int code){
    switch (code)
    {
    case 1:
        printf("Fatal fault: Parameters missing:\n");
        printf("Command structure <command> [-e] [-d] <key> <message>\n");
        break;
    case 2:
        printf("Fatal fault: Key invalid:\n");
        printf("Command structure <command> [-e] [-d] <key> <message>\n");
        break;
    case 3:
        printf("Fatal fault: Parameter not found:\n");
        printf("Command structure <command> [-e] [-d] <key> <message>\n");
        break;    
    default:
        printf("Fatal fault: Unknown:\n");
        printf("Command structure <command> [-e] [-d] <key> <message>\n");
        break;
    }
}
void encrypt(int key, char msg[]){
    printf("\n");
    for (size_t i = 0; msg[i] != '\0'; i++)
    {
        int newChar = msg[i] + key;
        if (newChar > MAX)
        {
            newChar = MIN + (newChar - 127);
        }
        msg[i] = newChar;
        printf("%c",msg[i]);
    }
    printf("\n");
}
void decrypt(int key, char msg[]){
    printf("\n");
    for (size_t i = 0; msg[i] != '\0'; i++)
    {
        int newChar = msg[i] - key;
        if (newChar < MIN)
        {
            newChar = MAX - (31 - newChar);
        }
        msg[i] = newChar;
        printf("%c",msg[i]);
    }
    printf("\n");
}