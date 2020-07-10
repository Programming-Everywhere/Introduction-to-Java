/*Author: Shayna Fu
Date: July 10, 2020

2.7
(Find the number of year) Write a program that prompts the user to enter the 
minutes (e.g., 1 billion), and displays the  number of years and days for the
minutes. For simplicity, assume a year had 365 days.

SOLUTION:*/

import java.util.Scanner;

class MinutesYearsDays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of minutes: ");
    int minutes = inpurt.nextInt();

    int year = minutes / 525600;
    int day = minutes / 1440;
    int


