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
public class A7Q9 {

    /**
     * Introducing the program to the user with the first question.
     */
    public static void intro() {
        //telling the user what the program is about
        System.out.println("This program allows you to input up to 9 digits.");
        System.out.println("However, if there is an even digit located within the"
                + " digits you've type in");
        System.out.println("it will state that the digits are flase odds, and will"
                + "tell you to retype for an");
        System.out.println("odd set of digits next time.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner to allow the user to input their own answer later.
        Scanner input = new Scanner(System.in);

        //creating a counter for the even numbers
        int counteven = 0;

        //creating a counter for the odd numbers
        int countodd = 0;
        //outputting the intro of the program into the main section
        intro();

        //blank space
        System.out.println("");

        //asking the user what number they want to type in
        System.out.println("What number do you want to type?");

        //allowing the user to input their digit
        int num = input.nextInt();

        //while statment to catch all of the odds and even numbers.
        //it is also stating that if the digit inputted by the user doesn't equal
        //to zero, then it keeps dividing and catergorizing each number.
        while (num != 0) {
            //seeing if there is and even numbers within the digit 
            if (num % 2 == 0) {
                //if there is any even digit it adds to the counter.
                counteven++;
            } else {
                //adding a number each time to the odd section. Adds to the counter
                countodd++;
            }
            //dividing the number over and over again until it hits zero
            num /= 10;
        }

        //telling the user if the odd is true or not
        if (counteven > 0) {
            //blank space
            System.out.println("");

            //telling the user that is isn't a true odd statment & how may odds
            //and even numbers there is within the digit
            System.out.println("This isn't a true odd digit statment.");
            System.out.println("Because there is " + counteven + " even numbers. "
                    + "Although there is " + countodd + " odd numbers.");
        } else {
            //blank space
            System.out.println("");

            //telling the user that it is a true odd statment & how many odds and
            //even numbers there is within the digit.
            System.out.println("This is a true odd digit statment.");
            System.out.println("Since there is " + counteven + " even numbers, "
                    + "and " + countodd + " odd numbers.");
        }
    }
}
