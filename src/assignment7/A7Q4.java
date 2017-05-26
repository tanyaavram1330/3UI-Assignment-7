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
public class A7Q4 {

    /**
     * Doing the equation of compound interest
     *
     * @param amount
     * @param interest
     * @param years
     * @return
     */
    public static double equationComp(double amount, double interest, double years) {

        //calculating the equation for the compound answer
        double finalanswer = amount * ((1 + interest) * Math.pow(1, years));

        //returning the answer to the code
        return finalanswer;
    }

    /**
     * Asking an amount question to the user for the equation to work
     */
    public static double amountAsk() {
        //inputing a scanner for the user to input
        Scanner input = new Scanner(System.in);

        //blank space
        System.out.println("");

        //asking the user what their amount of giving is
        System.out.println("How much money are you going to put into this?");

        //allowing the user to input their amount
        double numAmount = input.nextDouble();

        //returning the answer to the code
        return numAmount;
    }

    /**
     * Asking an interest question to the user for the equation to work
     */
    public static double interestAsk() {
        //inputing a scanner for the user to input
        Scanner input = new Scanner(System.in);

        //blank space
        System.out.println("");

        //asking the user what their interest is
        System.out.println("What is your interest?");

        //allowing the user to input a number
        double persent = input.nextDouble();

        //changing the persent of the interest into a number to use within the equation
        double numInterest = persent / 100;

        //returning the answer to the code
        return numInterest;
    }

    /**
     * Asking a question to the user for the question to work
     */
    public static double yearsAsk() {
        //inputing a scanner for the user to input
        Scanner input = new Scanner(System.in);

        //blank space
        System.out.println("");

        //asking the user how many years they'll be doing it
        System.out.println("How long is this going to be? (In years)");

        //allowing the user to input a number
        double numyears = input.nextDouble();

        //returning the answer to the code
        return numyears;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputing a scanner for the user to input
        Scanner input = new Scanner(System.in);

        //telling the user what the program is about and wha it is going to do
        System.out.println("This is method called compoundInterest. This program "
                + "will calculated and");
        System.out.println("find out how much money you have left.");

        //placing the amount question
        double answerAm = amountAsk();

        //placing the interest question
        double answerInt = interestAsk();

        //placing the years question
        double answerYer = yearsAsk();

        //putting the answers to the questions into the equation
        double ans = equationComp(answerAm, answerInt, answerYer);

        //outputting the answer to the equation for the user
        System.out.println(ans);
    }
}
