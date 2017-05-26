/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author anisoaraavram
 */
public class A7Q5 {

    /**
     * asking the user how many lines(numbers)they want output
     */
    public static int generatedLines() {
        //Creating a new scanner for the user to be able to input
        Scanner input = new Scanner(System.in);

        //blank space
        System.out.println("");

        //asking the user how many lines they want
        System.out.println("How many numbers do you want to see generated?");

        //allowing the user to input their desired number
        int numLine = input.nextInt();

        //returning the information to be stored
        return numLine;
    }

    /**
     * creating the equation for the code to create a random number
     *
     * @return
     */
    public static int numRand() {
        //calculating the equation
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

        //returning the equation back into the code to be stored
        return randNum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a new scanner for the user to be able to input
        Scanner input = new Scanner(System.in);

        //telling the user what this program is about
        System.out.println("Within this program the computer will give you a"
                + " random number from 1 to 5.");
        System.out.println("However. First it'll ask you how many lines of "
                + "numbers you want within the output.");

        //storing the number to be used later within the code
        int lineNum = generatedLines();

        //outputting the symbols to the amount of numbers created within the code
        for (int i = 0; i < lineNum; i++) {
            //sotring the number to be used later in the code
            int RandNum = numRand();
            //making the random numbers to output the same amount of '*' as the number
            for (int j = 0; j < RandNum; j++) {
                System.out.print('*');
            }
            //blank spaces
            System.out.println("");
            System.out.println("");
        }
    }
}
