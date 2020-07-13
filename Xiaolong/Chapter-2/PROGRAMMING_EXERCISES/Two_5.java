import java.util.*;
class Two_5 {
  public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the subtotal and a gratuity rate: ");
     double subtotal = keyboard.nextDouble();
     double rate = keyboard.nextDouble();
     System.out.print("The gratuity is $"+subtotal*(rate/100.0)+" and total is $"+ (subtotal +  subtotal*(rate/100.0)));
  }
}
