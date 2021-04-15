import java.util.Arrays;
import java.util.Scanner;


/**
 * Date: 14/04/2021
 * Day: 3 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * This is a terminal like app
 * 
 */


public class daythree {

    // here are some global primitives
    public String [] commands = {"q","test"};


    //helper
    public static boolean cmdExists(String[] arr, String targetValue) {//this checks if the command is valid
        return Arrays.asList(arr).contains(targetValue);
    }

    //master
    public void execCmd(String [] cmdMessage){//here we execute the commands
        //cmdMessage[0] is the command and the rest are parameters
        
        //after exec we ask for more commands
        takeCommand();
        /*
        if (cmd.equals("fuckface")) {
            System.out.println("you are a winner");
        }
        if (cmd.equals("q")) {
            System.exit(0);
        }
        */
    }

    //master
    public void commandReco(String cmd){//here we recognise the commands
        String [] message = cmd.split(" ");
        if (cmdExists(commands, message[0])) {
            System.out.println("works "+  message[0]);
            execCmd(message);
        }
        else{
            System.out.println("lamprosnet: " + message[0] + ": command not found");
        }
        
        
    }

    //master
    public void takeCommand(){//in this method we ask for the user to input the commands
        Scanner commandInput = new Scanner(System.in);
        System.out.print("lamprosnet: admin$ ");
        String command = commandInput.nextLine();
        if (command.isEmpty() || command.startsWith(" ")) {
            takeCommand();
        } else {  
            commandReco(command);
        }
    }

    public static void main(String[] args) {
        daythree day = new daythree();

        System.out.println("I am listening :");
        day.takeCommand();
    }
}
