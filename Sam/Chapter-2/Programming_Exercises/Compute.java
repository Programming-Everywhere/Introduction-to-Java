package Chapter_2;

import java.util.Scanner;


 /**
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, the converts it to Fahrenheit and displays the rest.
The formula for the conversion is as follows:



2.2 (Compute the volume of a cylinder)
    Write a program that reads in radius & the length of a cylinder & computes 
    the area & volume using the following formulas:
    
    area = radius * radius * 𝜋
    volume = area * length
    
    Here is a sample run: 
    
    Enter the radius & length of a cylinder: 5.5 12
    The area is 95.0331
    The volume is 1140.4
    
   */



class Exercise_2 {
	
	public static void main(String[] args) {
		
		double radius = 0;
		double length = 0;
		double volume = 0;
		double area = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius and the length of a cylinder: ");

		while (true) {
			if (scanner.hasNextDouble()) {
				radius = scanner.nextDouble();
				if (scanner.hasNextDouble()) {
					length = scanner.nextDouble();
					break;
				}
			}
			else
				scanner.nextLine();
		}
		
		scanner.close();
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("The area is: " + area);
		System.out.println("The volume is: " + volume);
		
		
	}
}
