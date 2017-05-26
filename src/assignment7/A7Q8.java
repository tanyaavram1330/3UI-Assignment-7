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
public class A7Q8 {

    /**
     * The months of winter
     */
    public static void Winter() {
        //telling the user what season it is
        System.out.println("One of the months of: December, January, and Febuary."
                + " The season of Winter.");
    }

    /**
     * The months of Spring
     */
    public static void Spring() {
        //telling the user what season it is
        System.out.println("One of the months of: March, April, and May."
                + " The season of Spring.");
    }

    /**
     * The months of summer
     */
    public static void Summer() {
        //telling the user what season it is
        System.out.println("One of the months of: June, July, and Augest."
                + " The season of Summer.");
    }

    /**
     * The months of fall
     */
    public static void Fall() {
        //telling the user what season it is
        System.out.println("One of the months of: September, Octomber, and November."
                + " The season of Fall.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputing a scanner so then the user can input their month
        Scanner input = new Scanner(System.in);

        //telling the user that the program is about
        System.out.println("Within this program you can type any month from 1-12"
                + " and it'll tell you what");
        System.out.println("season each of the month is. The program only runs "
                + "with numbers. So inputting");
        System.out.println("the name of the month won't work for the program.");

        //blank space
        System.out.println("");

        //asking the user what month they want to input
        System.out.println("What season of the month do you want to know?");

        //allowing the user to input
        int Inmonth = input.nextInt();

        //blank space
        System.out.println("");

        //putting the input into different cattegories
        //the season of winter
        if (Inmonth == 1 || Inmonth == 2 || Inmonth == 12) {
            Winter();
        }

        //the season of spring
        if (Inmonth == 3 || Inmonth == 4 || Inmonth == 5) {
            Spring();
        }

        //the season of summer
        if (Inmonth == 6 || Inmonth == 7 || Inmonth == 8) {
            Summer();
        }

        //the season of fall
        if (Inmonth == 9 || Inmonth == 10 || Inmonth == 11) {
            Fall();
        }

        //if the user inputs a bigger number
        if (Inmonth > 12 || Inmonth < 1) {
            //telling the user that they didn't type in the correct numbers
            System.out.println("That isn't a month. Try input a real number "
                    + "of a month next time.");
        }
    }
}
