/**
 * 
 * Day: 1 / 100
 * Creator: Lampros Fasoulas
 * 
 */

import java.util.Scanner;
public class dayone {//simple code its 3 am and i need to go to bed 

    public void add(int one, int two){//addition method
        int sum = one + two;
        System.out.println(sum);
        
    }
    public void sub(int one, int two){//substraction method
        int sum = one - two;
        System.out.println(sum);
        
    }
    public void mul(int one, int two){//multiplication method
        int sum = one * two;
        System.out.println(sum);
        
    }
    public void div(int one, int two){//division method
        int sum = one / two;
        System.out.println(sum);
        
    }
public static void main(String[] args) {
    dayone day = new dayone();
    Scanner uin = new Scanner(System.in);
    System.out.println("Input a number :");
    int one = uin.nextInt();
    System.out.println("Input a second number :");
    int two = uin.nextInt();
    
    System.out.println("Please choose :");
    System.out.println("For + press (1), for - press (2), for * press (3), for / press (4) :");
    int selection = uin.nextInt();
    switch (selection) {//choose between actions
        case 1:
            day.add(one, two);
            break;
        case 2:
            day.sub(one, two);
            break;
        case 3:
            day.mul(one, two);
            break;
        case 4:
            day.div(one, two);
            break;
        default:
        break;
        }
        uin.close();
        
}
    
} 
