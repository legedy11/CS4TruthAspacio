/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02truthaspacio;
import java.util.Scanner;
/**
 *
 * @author Jed
 */
public class Ex02TruthAspacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean init = true;
        int guesses = 3;
        int lowerLimit = 0;
        int upperLimit = 10;
        String startGame = "Start game";
        String changeSettings = "Change settings";
        String endApp = "End application";
        Scanner startMenu = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);
        while(init){
        int random = (int) Math.floor(Math.random()*upperLimit) + lowerLimit;
        System.out.printf("%nWelcome to Higher or Lower! What will you do? %n-%s%n-%s%n-%s%n", startGame, changeSettings, endApp);
        String menuSelect = startMenu.nextLine();
        if (startGame.equalsIgnoreCase(menuSelect))  {
            System.out.printf("started%n%d%n", random);
        }
        if (changeSettings.equalsIgnoreCase(menuSelect))  {
            System.out.printf("%nWhat is the lower limit of the random number? ");
            lowerLimit = guess.nextInt();
            System.out.printf("%nWhat is the upper limit of the random number? ");
            upperLimit = guess.nextInt();
            System.out.printf("%n%d%n%d%n", lowerLimit, upperLimit);
        }
        if (endApp.equalsIgnoreCase(menuSelect))  {
            System.out.printf("%nThank you for playing!%n");
            init = false;
            break;
        }
        } 
    }
    
}
