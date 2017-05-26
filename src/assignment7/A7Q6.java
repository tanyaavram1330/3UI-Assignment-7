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
public class A7Q6 {

    /**
     * Taking out the final number to output it back to the user.
     *
     * @return
     */
    public static int Equations() {
        //getting a scanner to allow the user to input information
        Scanner input = new Scanner(System.in);

        //allowing the user to input their chosen number
        int num = input.nextInt();

        //doing the final equation to get the result of the last number.
        int finalnum = num % 10;

        //returning the final equations
        return finalnum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //telling the user that the program is about
        System.out.println("This program will let you type any number up to 9 nmbers long"
                + " and give you the last digit.");

        //blank space
        System.out.println("");

        //asking the user what number they want
        System.out.println("what number do you want to type?");

        //storing the number into the code
        int Finalnum = Equations();

        //blank space
        System.out.println("");

        //outputting the answer for the user
        System.out.println("The last number is " + Finalnum + ".");
    }
}
