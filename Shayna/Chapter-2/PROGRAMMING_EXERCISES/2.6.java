/*Author: Shayna Fu
Date: July 10, 2020

2.6
(Sum the digits in an integer) Write a program that reads an integer between
0 and 1000 and add all the digits in the integer. For example, if an integer is
932, the sum of all its digits is 14.

SOLUTION:*/

import java.util.Scanner;

class SumOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();

    int number1 = number % 10;
    number /= 10;
    int number2 = number % 10;
    number /= 10;
    int number3 = number % 10;
    number /= 10;
    int sum = number1 + number2 + number3;

    System.out.println("The sum of the digitis is " + sum);
  }
}
