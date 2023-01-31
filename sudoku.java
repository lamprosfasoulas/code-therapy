import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 1/06/2021
 * Day: 10 / 100
 * 
 * Creator: Lampros Fasoulas
 * 
 * -- Project Description --
 * i am hoping this will be a sudoku solver
 */
public class sudoku {
    public static int [] options = {1,2,3,4,5,6,7,8,9};
    public static ArrayList<Integer> restrictions = new ArrayList<Integer>();
    public static void main(String[] args) {
        restrictions.add(5);
        restrictions.add(8);
        restrictions.add(1);
        for (int i : options) {
            if (restrictions.indexOf(options[i-1]) > -1) {
                System.out.println(options[i-1]);
            }
        }
    }
}
