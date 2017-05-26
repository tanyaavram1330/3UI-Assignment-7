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
public class A7Q1 {

    /**
     * creating the equation for the area of a circle
     *
     * @param radius
     * @return
     */
    public static double areaOfCircle(double radius) {
        //calculating the radius of the circle
        double rCircle = Math.pow(radius, 1);

        //calculating the area of the circle
        double area = Math.PI * rCircle;

        //returning the information back to the computer to not be lost
        //however, it'll be double because of the format of the overall code
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a program to calculate the area of a circle by the given numbers
        //creating a scanner for the user to input their information
        Scanner input = new Scanner(System.in);

        //telling the user how the program is going to run. And the outcome.
        System.out.println("Within this program you can calculate the area of "
                + "a circle. However, it'll be doubled.");

        //blank space to ease the eye
        System.out.println("");

        //asking the user what radius the circle is.
        System.out.println("What is the radius of the circle?");

        //allowing the user to input their radius number of their circle
        double num = input.nextDouble();

        //conducting the equation to find the area of the circle
        double answer = areaOfCircle(num);

        //roundind the answer up to the whole numbers
        answer = Math.round(answer);

        //giving the user their answer for the radius of the circle
        System.out.println("Your double radius is " + answer + ".");
    }
}
