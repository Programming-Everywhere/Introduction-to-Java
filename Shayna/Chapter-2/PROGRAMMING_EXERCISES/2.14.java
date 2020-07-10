/*Author: Shayna Fu
Date: July 10, 2020

2.14
(Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
It can be calculated by taking your weight in kilograms and dividing by the square of your
height in meters. Write a program that prompts the user to enter a weight in pounds and height in
inches and displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is
0.0254 meters.

SOLTUTION:*/

import java.util.Scanner;

class BodyMassIndex {
  public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();

    weight = weight * KILOGRAMS_PER_POUND;
    height = height * METERS_PER_INCH;

    double bodyMassIndex = weight / Math.pow(height, 2);

    System.out.println("BMI is " + bodyMassIndex);

  }
}

