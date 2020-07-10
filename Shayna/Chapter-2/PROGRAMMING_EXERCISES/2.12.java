/*Author: Shayna Fu
Date: July 10, 2020

2.12
(Physics: finding runway length) Given an airplanes acceleration a and take-off speed v, you can
compute the minimum runway length needed for an airplane to take off using the following formula:
                                           v^2
                                 length =-------
                                           2a

Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a
in meters/second squared (m/s^2), and displays the minimum runway length.

SOLUTION:*/

import java.util.Scanner;

class AirplaneMode {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter speed and acceleration: ");
  double speed = input.nextDouble();
  double acceleration = input.nextDouble();

  double length = (speed * speed) / (2 * acceleration);

  System.out.println("The minimum runway length for this airplane is " + length);
 
  }
}
