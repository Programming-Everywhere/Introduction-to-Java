import java.util.*;
class Two_2 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the radius and length of a cylinder: ");
     double radius = keyboard.nextDouble();
     double length = keyboard.nextDouble();
     
     double area = radius * radius * Math.PI;
     System.out.println("The area is " + area);
     System.out.println("The vilume is " + area * length);
  }
}
