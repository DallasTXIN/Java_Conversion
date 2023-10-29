//Dallas Lawson
//October ??, 2023
//Prof. Bowman
//SDEV200-1AH
//Chapter 6, Assignment 6.9: Foot-To-Meter/Meter-To-Foot Conversion

import java.util.Scanner;

public class Conversion {

  public static void main (String [] args) {   
  Scanner input = new Scanner (System.in);

  System.out.println("Please enter a number in feet: ");
  double value1 = input.nextDouble();
  double meters = value1 * 0.305;
  System.out.println (value1 + " feet is " + meters + " meters.");
    
  System.out.println("Please enter a number in meters: ");
  double value2 = input.nextDouble();
  double feet = value2 * 3.279;
  System.out.println (value2 + " meters is " + meters + " feet.");

    }