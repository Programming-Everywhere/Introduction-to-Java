/* Author: Shayna Fu
Date: July 9, 2020

2.2
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:

area = radius * radius * π
volume = area * length

SOLUTION:*/

import java.util.Scanner;

class VolumeOfCylinder {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the radiius and length of a cylinder: ");
  double radius = input.nextDouble();
  double length = input.nextDouble();
  
  double area = radius * radius * 3.14159;
  double volume = area * length;
  System.out.println("The area of the cylinder is " + area + " and the volume of the cylinder is " + volume);
  }
}

  
