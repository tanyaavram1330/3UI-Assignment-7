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
public class A7Q7 {

    /**
     * Taking out the final number to output it back to the user.
     *
     * @return
     */
    public static int Equations(int num) {
        //
        int length = String.valueOf(num).length();

        //doing an equation to get the first digit
        double firstnum = num / (Math.pow(10, length - 1));
        //        \/ Referance of another way to do.
        //        firstnum = Math.floor(firstnum);
        //        int numfirst = (int)firstnum;
        //        //returning the number
        //        return numfirst;

        //returning the statment
        return (int) firstnum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //getting a scanner to allow the user to input information
        Scanner input = new Scanner(System.in);

        //telling the user that the program is about
        System.out.println("This program will let you type any number up to 9 nmbers long"
                + " and give you the first digit.");

        //blank space
        System.out.println("");

        //asking the user what number they want
        System.out.println("what number do you want to type?");

        //allowing the user to input their chosen number
        int num = input.nextInt();

        //storing the number into the code
        int FirstDig = Equations(num);

        //blank space
        System.out.println("");

        //outputting the answer for the user
        System.out.println("The first number is " + FirstDig + ".");
    }
}
