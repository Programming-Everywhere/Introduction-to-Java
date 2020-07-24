*/
*/ 
Samantha Alcantara
Date : 07 10 2020

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
    
    /*
    Answer
    
   import java.util.Scanner;
public class ComputeVolumeWithConstant {

    public static void main(String[] Strings) {
      final double PI = 3.14159;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the radius and the length of a cylinder: ");
      double radius = input.nextDouble();
      double length = input.nextDouble();

      double area = radius * radius * 3.14159265359;
      double volume = area * length;

      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
    }
}
