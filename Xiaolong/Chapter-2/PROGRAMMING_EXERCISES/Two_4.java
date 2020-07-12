import java.util.*;
class Two_4 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter a number in pounds: ");
     double pounds = keyboard.nextDouble();
     System.out.print(pounds + " pounds is " + pounds * 0.454 + " kilograms");
  }
}
