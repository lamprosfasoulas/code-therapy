/**
<<<<<<< HEAD
 *test2 
=======
 *
>>>>>>> 0344b82caf996487d12e7d77e63e65f27b56e7ad
 * Day: 2 / 100 (!- Just for indication, this is not the project of the day, maybe ... -!)
 * Creator: Lampros Fasoulas
 * This is just a helper project
 *  
 **/

import java.util.Scanner;

public class talk{

    public static void talk(String msg){//run the terminal command say with the message
        try{
            Runtime.getRuntime().exec("say " + msg);

        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//init scanner

        System.out.println("Text what you want and the machine will say it: ");
        String msg = in.nextLine().toString();//get text
        talk(msg);//parse text to talk function
        in.close();
    }
}
