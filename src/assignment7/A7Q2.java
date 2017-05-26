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
public class A7Q2 {

    /**
     * Telling the user what happens if their student gets below 50%
     */
    public static void gradeF() {
        //telling the user what marks the student gets
        System.out.println("The student earns an 'F'.");
    }

    /**
     * Telling the user what happens if their student gets between 50-59%
     */
    public static void gradeD() {
        //telling the user what mark the student gets
        System.out.println("The student earns a 'D'.");
    }

    /**
     * Telling the user what happens if their student gets between 60-69%
     */
    public static void gradeC() {
        //telling the user what mark the student gets
        System.out.println("The student earns a 'C'.");
    }

    /**
     * Telling the user what happens if their student gets between 70-79%
     */
    public static void gradeB() {
        //telling the user what mark the student gets
        System.out.println("The student earns a 'B'.");
    }

    /**
     * Telling the user what happens if their student gets above 80%
     */
    public static void gradeA() {
        //telling the user what mark the student gets
        System.out.println("The students earns an 'A'.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputing a scanner for the user to input any of their information
        Scanner input = new Scanner(System.in);

        //telling the user what the program is used for and what it'll do
        System.out.println("Hello! This is examGrade. This program will tell you "
                + "the letter grade of the students.");

        //blank space
        System.out.println("");

        //asking the user what grade their student got
        System.out.println("What grade did your student get?");

        //allowing the user to input a number
        double num = input.nextDouble();

        //outputs the answer if it is above 80
        if (num >= 80 && num <= 100) {
            gradeA();
        }

        //outputs the answer if it is above 70
        if (num >= 70 && num <= 79) {
            gradeB();
        }

        //outputs the answer if it is above 60
        if (num >= 60 && num <= 69) {
            gradeC();
        }

        //outputs the answer if it is above 50
        if (num >= 50 && num <= 59) {
            gradeD();
        }

        //outputs the answer if it is under 50
        if (num < 50) {
            gradeF();
        }
    }
}
