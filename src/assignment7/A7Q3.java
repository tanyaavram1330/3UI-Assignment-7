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
public class A7Q3 {

    /**
     * Creating an equation to find the factor of the number that the user
     * inputed
     *
     * @param factor
     */
    public static void evenFactor(int factor) {

        //creating an equation to go from the top to bottom dividing to get the
        //whole numbers. After it takes the whol numbers and divide again to get
        //the factors for the number that the user inputed
        for (int i = factor; i > 0; i--) {
            double divide = factor % i;
            if (divide == 0) {
                System.out.print(factor / i + " ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputing a scanner for the user to input
        Scanner input = new Scanner(System.in);

        //Telling the user what the code or program is about
        System.out.println("This program is about factors. Input any number "
                + "and all the factors of it will output.");

        //blank space
        System.out.println("");

        //asking the user what factor she wants to use
        System.out.println("What factor do you want to use?");

        //inputing the factor
        int inputFactor = input.nextInt();

        //inputing the number that the user inputed into the equation
        evenFactor(inputFactor);
    }
}
