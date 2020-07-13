/* Author: Shayna Fu
Date: July 11, 2020

2.15
(Geometry: distance of two points) Write a program that prompts the user to enter
two poits (x1, y1) and (x2, y2) and displays thier distance between them. The formula
for computing the distance is .. Not ethat you can use Math.pow(a, 0.5) to compute a.

SOLUTION: */

import java.util.Scanner;

class PointDistance {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter x1 and y1: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
   
    System.out.print("Enter x2 and y2: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    double distance = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    double computedDistance = Math.pow(distance, 0.5);

    System.out.println("The distance between the two points is " + computedDistance);

  }
}

