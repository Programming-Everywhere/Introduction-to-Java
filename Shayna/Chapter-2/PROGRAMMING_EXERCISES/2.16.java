/*Author: Shayna Fu
Date: July 11, 2020

2.16
(Geometry: area of a hexagon) Wrie a program that prompts the user to enter
the side of a hexagon and displays its area. The formula for computing the 
area of a is

  
                    Area = 3 Sqrt 3
                          ----------s^2 
                              2     
                          
where s is the length of a side.

SOLUTION: */


import java.util.Scanner;

class HexagonArea {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the sides: ");
    double side = input.nextDouble();

    double area = (3 * 1.732) / 2 * Math.pow(side, 2);

    System.out.println("The area of the hexagon is " + area);

  }
}
  
