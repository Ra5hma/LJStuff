package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try { //prevents user from crashing by not reading directions
            Scanner inputType = new Scanner(System.in);
            Scanner inputValue = new Scanner(System.in);

            System.out.println("IMPORTANT!!:: /N ONLY USE NUMERALS, NOT LETTERS FOR CHOICES. ");
            System.out.println("");
            System.out.println(" Type 0 for Celsius \n Type 1 for Fahrenheit \n Type 2 for Kelvin \n");
            System.out.println("Which Temperature Format are you starting with? -");
            double type = inputType.nextInt();

            System.out.println("What is the numeric value you wish to convert? -");
            double value = inputValue.nextInt();

        }
        catch(Exception e){
            System.out.println("That's not the right input form, try again please.");
        }//  add a loop to return to input type
    }
}
