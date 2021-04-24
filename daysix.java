import java.nio.Buffer;
import java.util.Arrays;
import java.util.List;

/**
 * Date: 17/04/2021
 * Day: 6 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * brute force wannabe program in java
 */

 //there is a problem in validating the key to the guess
 //so this is for educational perposes only :-)
public class daysix {
    private static int min = 97 , max = 122;//because 32 is space these are the decimal values of a-z you can add your own 
    private static int tries;
    private static StringBuilder testValue = new StringBuilder("");
    private static String keyString= "hello";

    private static void incrementLastDigit(){
            for (int i = min; i <= max; i++) {//min and max is my charset in ASCII
                tries ++;
                testValue.setCharAt(testValue.length()-1, (char) i);
                System.out.println(testValue);
                if(testValue.toString().equals(keyString)){
                    System.exit(0);
                }
                else if (i == max) {
                    increasePreviousDigit(testValue.length()-2);
                    i = min;
                }
                
            }
            
    }
    private static void increasePreviousDigit(int indexToBeIncreased) {
        try {
            int nextChar = testValue.charAt(indexToBeIncreased) +1;
            if (nextChar > max) {
                testValue.setCharAt(indexToBeIncreased, (char) min);
                increasePreviousDigit(indexToBeIncreased -1);
            }
            else{
                testValue.setCharAt(indexToBeIncreased, (char) nextChar);
                
            }
        } catch (IndexOutOfBoundsException e) {
            testValue.insert(0, (char) min);
            
        }
    }
    
    public static void main(String[] args) {
        testValue.append((char) min);
        incrementLastDigit();
    }
	
}

    


